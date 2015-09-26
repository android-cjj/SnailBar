[![Android Gems](http://www.android-gems.com/badge/android-cjj/SnailBar.svg?branch=master)](http://www.android-gems.com/lib/android-cjj/SnailBar)

SnailBar
====================================================
A lovely ![](http://www.apkbus.com/data/attachment/forum/201509/14/151713juzbb33ywz337ajr.png) ,you can use it as a seekbar or progressbar.
---------------------------------------------------------------------------------
[Helixbar](https://dribbble.com/shots/541530-Helixbar) design by Davlikanoff.This is his words：

Hi Guys! 

This 18 seconds long animation demonstrates cool progressbar in action. I created it at leisure. You can download the PSD here: 

http://davlikanoff.com/portfolio/Helixbar/helixbar_free.zip

I called it Helixbar. It could've been a Snailbar, but I like Helixbar :) 
Hope you like it.


![](http://www.apkbus.com/data/attachment/forum/201509/14/152642n3a5kvn36a6v3m3a.gif)

But I like snail,So it's called SnailBar.

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
SnailBar is a subclass of Seekbar, so you can use it like Seekbar
```java
  seekBar = (SeekBar) findViewById(R.id.seekBar);
  ```
  
[about me](http://android-cjj.github.io/)
------------------------------------

AT LAST
==============================================================
If you want to support me,you can follow me on Github.
  

License
=======

    The MIT License (MIT)

	Copyright (c) 2015 android-cjj

	Permission is hereby granted, free of charge, to any person obtaining a copy
	of this software and associated documentation files (the "Software"), to deal
	in the Software without restriction, including without limitation the rights
	to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
	copies of the Software, and to permit persons to whom the Software is
	furnished to do so, subject to the following conditions:

	The above copyright notice and this permission notice shall be included in all
	copies or substantial portions of the Software.

	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
	IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
	FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
	AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
	LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
	OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
	SOFTWARE.









