adb shell rm -rf /mnt/sdcard/window_dump.*

adb push dumpUI.apk /data/local/tmp/com.example.android.testing.uiautomator.BasicSample.test
adb shell pm install -t -r "/data/local/tmp/com.example.android.testing.uiautomator.BasicSample.test"

adb shell am instrument -w -r   -e debug false -e class 'com.example.android.testing.uiautomator.BasicSample.DumpUI' com.example.android.testing.uiautomator.BasicSample.test/android.support.test.runner.AndroidJUnitRunner

adb pull /mnt/sdcard/window_dump.uix .
adb pull /mnt/sdcard/window_dump.png .