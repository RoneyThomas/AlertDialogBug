# AlertDialogBug

This is a sample app to demo the bug in Android DatePicker. This only affects devices running Android 6/Android N which have high dpi like nexus 6p and nexus 9.

The issue here is that `android:layout_width="match_parent"` doesn't work for the DatePicker widget.

[Star the issue if you are also having trouble](https://code.google.com/p/android/issues/detail?id=212698).

Here it's running on nexus6p android 5.1 emulator. This is how it should work. 
![alt tag](https://github.com/RoneyThomas/AlertDialogBug/blob/master/android-5.1.png)


On Android 6/Android N. It doesn't use the full width of the screen.

Android 6
![alt tag](https://github.com/RoneyThomas/AlertDialogBug/blob/master/android-6.png)

Android N Nexus 6p
![alt tag](https://github.com/RoneyThomas/AlertDialogBug/blob/master/android-n.png)

Android N Nexus 9
![alt tag](https://github.com/RoneyThomas/AlertDialogBug/blob/master/android-n-tablet.png)

I have tried running the demo on a moto e and nexus 4 running android 6 AOSP and this problem doesn't seem to appear.
From what i understand this only affects devices with higher ppi.

Turns out other people are also having the [issue](http://stackoverflow.com/questions/35235344/datepicker-widget-does-not-take-up-entire-alertdialog-on-nexus-6).

