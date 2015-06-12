# AndroidStudioAndRobolectric

Example with an android library module which depends on other libraries (aar).

For details see master readme file https://github.com/nenick/AndroidStudioAndRobolectric

Knwon Issue:

App module don't get compiled when use `./gradlew core:test` which results in different ClassNotFoundExceptions. Instead be sure that the app moodule get compiled too `./gradlew assembleDebug core:test` This issue should be fixed with build tools 1.3 release https://code.google.com/p/android/issues/detail?id=156027
