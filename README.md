# AndroidStudioAndRobolectric

Example with an android library module.

For details see master readme file https://github.com/nenick/AndroidStudioAndRobolectric

### Known Issues

#### package R does not exist
The issue is tracked here https://code.google.com/p/android/issues/detail?id=144573 A workaround is to add `android.sourceSets.test.java.srcDirs += "build/generated/source/r/debug"` at the module build.gradle.

