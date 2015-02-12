# AndroidStudioAndRobolectric

- Android Studio 1.1.0 (Beta 4)
- android gradle build tools 1.1.0-rc1
- Robolectric 2.4
- no extra plugins or to complex custom setup

For details see http://nenick-android.blogspot.de/2015/02/android-studio-110-beta-4-and.html

### Get Started
1. Just clone and open this project with Android Studio
2. Change the Build Variant // Test Artifact to Unit Test (http://tools.android.com/tech-docs/unit-testing-support)
3. Right click on a test and get started with robolectric.

Here an example with flavors https://github.com/nenick/AndroidStudioAndRobolectric/tree/flavors

### Test resources not found

The issue with missing `src/test/resources` is tracked at https://code.google.com/p/android/issues/detail?id=136013 there also some workarounds to include test resources.

### split-select' specified for property 'splitSelectExe' does not exist.

This is tracked at https://code.google.com/p/android/issues/detail?id=135513. This will occur if you try to install the app from command-line. You can install the app using Android Studio. Tests from command-line are working.
