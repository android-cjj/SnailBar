SnailBar
====================================================
A lovely ![](http://www.apkbus.com/data/attachment/forum/201509/14/151713juzbb33ywz337ajr.png) ,you can use it as a seekbar or progressbar.
---------------------------------------------------------------------------------
[Helixbar](https://dribbble.com/shots/541530-Helixbar) design by Davlikanoff Design.This is his words：
Hi Guys! 
This 18 seconds long animation demonstrates cool progressbar in action. I created it at leisure. You can download the PSD here: 
http://davlikanoff.com/portfolio/Helixbar/helixbar_free.zip
I called it Helixbar. It could've been a Snailbar, but I like Helixbar :) 
Hope you like it.

![](http://www.apkbus.com/data/attachment/forum/201509/14/152642n3a5kvn36a6v3m3a.gif)

But I like snail, so he called SnailBar.

This is my implementation effect
----------------------------------------------------------------

![](http://www.apkbus.com/data/attachment/forum/201509/14/151339qunvu66u2ruknr6n.gif)

how to use ?
-------------------------------------------------------
in layout.xml
```xml
   <com.cjj.SnailBar
            android:id="@+id/seekBar"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:thumb="@anim/snailanim" />
```
Because SnailBar is a subclass of Seekbar, so you can use it like Seekbar
```java
  seekBar = (SeekBar) findViewById(R.id.seekBar);
  ```
  









