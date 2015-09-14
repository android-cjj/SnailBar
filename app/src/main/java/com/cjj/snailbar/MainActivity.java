package com.cjj.snailbar;

import android.annotation.TargetApi;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;

    private TextView seekbar_percent, seekbar_status;
    int len = 0;
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setMax(100);

        seekbar_percent = (TextView) findViewById(R.id.seekbar_percent);

        seekbar_status = (TextView) findViewById(R.id.seekbar_status);

        seekBar.setOnSeekBarChangeListener(seekbarChangeListener);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
              handler.sendEmptyMessage(1);
            }
        },2000);

    }

    private SeekBar.OnSeekBarChangeListener seekbarChangeListener = new SeekBar.OnSeekBarChangeListener() {

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // TODO Auto-generated method stub
//            seekbar_status.setText("snailbar stop");

        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // TODO Auto-generated method stub
//            seekbar_status.setText("snailbar changle");
        }

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress,
                                      boolean fromUser) {
//            seekbar_status.setText("snailbar working");

            Message message = new Message();

            Bundle bundle = new Bundle();

            float pro = seekBar.getProgress();

            float num = seekBar.getMax();

            float result = (pro / num) * 100;

            bundle.putFloat("per", result);

            message.setData(bundle);

            message.what = 0;

            handler.sendMessage(message);

        }
    };


    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what)
            {
                case 0:
//                    seekbar_percent.setText("snailbar percent :       "
//                            + msg.getData().getFloat("per") + "%");

                    break;
                case 1:

                    if (seekBar.getProgress()<100)
                    {

                        if(seekBar.getProgress()<20)
                        {
                            len += 2;
                            handler.sendEmptyMessageDelayed(1,500);
                            seekbar_status.setText("Normal download speed.");
                        }else if(seekBar.getProgress()>21&&seekBar.getProgress()<26)
                        {
                            len += 1;
                            handler.sendEmptyMessageDelayed(1,1000);
                            seekbar_status.setText("Sundden speed down or disconnet...");
                        }
                        else
                        {
                            len += 2;
                            handler.sendEmptyMessageDelayed(1,50);
                            seekbar_status.setText("Sundden speed up.");
                        }
                        seekBar.setProgress(len);

                    }
                    break;
            }

        }

    };
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
