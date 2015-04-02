# AndroidStudioAndRobolectric

- Android Studio 1.1 [Overview](http://tools.android.com/recent) (works also with 1.2 preview 4)
- Android Gradle Build Tools 1.1.3 [Overview](https://developer.android.com/tools/revisions/gradle-plugin.html)
- Gradle 2.3 [Overview](http://gradle.org/docs/current/release-notes)
- Robolectric 3.0-RC2 (works much much better with Android SDK v21 than older releases)
- no extra plugins necessary (but you should also try [robolectric-gradle-plugin](https://github.com/robolectric/robolectric-gradle-plugin))

For details see http://nenick-android.blogspot.de/2015/03/android-studio-110-and-robolectric-30.html

## Get Started on command-line
1. Just clone.
2. Go into the project directory.
2. Run `./gradlew test` and get started with robolectric.

## Get Started with Android Studio
1. Import this project with Android Studio.
2. Change the Build Variant // Test Artifact to Unit Test (http://tools.android.com/tech-docs/unit-testing-support).
3. Right click on a test and get started with robolectric.

## More example project setups

### Flavors
Here an example with flavors https://github.com/nenick/AndroidStudioAndRobolectric/tree/flavors

### Multi Modules (Android Library)
Here an example with android library module https://github.com/nenick/AndroidStudioAndRobolectric/tree/library

### Separate Test Module
For some use cases it is great to split tests into different modules https://github.com/nenick/android-gradle-template
