
Use android tool (Library/Android/sdk/tools/bin/uiautomatorviewer) or adb command (adb shell uiautomator dump) to dump animation page, always get error message:  ERROR: could not get idle state.

To solve this issue, download google test project from https://github.com/googlesamples/android-testing/tree/master/ui/uiautomator/BasicSample, then add DumpUI.java to capture UI hierarchy.

How to use it?

1. adb install Basic UIAutomator.apk

2. ./dumpUI.sh

3. You will get window_dump.png/window_dump.uix in current directory

4. Import window_dump.png/window_dump.uix by uiautomatorviewer

