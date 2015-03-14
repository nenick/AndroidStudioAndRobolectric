package com.example.myapplication;

import org.junit.runners.model.InitializationError;
import org.robolectric.RobolectricTestRunner;

import java.io.File;

public class CustomRobolectricRunner extends RobolectricTestRunner {
    public CustomRobolectricRunner(Class<?> testClass) throws InitializationError {
        super(testClass);
        String buildVariant = BuildConfig.BUILD_TYPE + (BuildConfig.FLAVOR.isEmpty() ? "" : "/" + BuildConfig.FLAVOR);
        String manifestPath = "build/intermediates/manifests/full/" + buildVariant + "/AndroidManifest.xml";
        if (!new File(manifestPath).exists()) {
            throw new IllegalStateException("AndroidManifest.xml not found at " + manifestPath + ". Try changing the working directory in your default JUnit configuration to $MODULE_DIR$ (Run -> Edit Configurations -> Defaults). Also see https://code.google.com/p/android/issues/detail?id=158015 for more details for this issue.");
        }

        System.setProperty("android.package", BuildConfig.APPLICATION_ID);
        System.setProperty("android.manifest", manifestPath);
        System.setProperty("android.resources", "build/intermediates/res/" + buildVariant);
        System.setProperty("android.assets", "build/intermediates/assets/" + buildVariant);
    }
}
