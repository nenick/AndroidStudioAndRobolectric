package com.example.core;

import org.junit.runners.model.InitializationError;
import org.robolectric.RobolectricTestRunner;

import java.io.File;

public class CustomRobolectricRunner extends RobolectricTestRunner {
    public CustomRobolectricRunner(Class<?> testClass) throws InitializationError {
        super(testClass);
        String module = "";
        String buildVariant = (BuildConfig.FLAVOR.isEmpty() ? "" : BuildConfig.FLAVOR + "/") + BuildConfig.BUILD_TYPE;
        String manifestPath = "build/intermediates/bundles/" + buildVariant + "/AndroidManifest.xml";
        if (!new File(manifestPath).exists()) {
            module = "app/";
        }
        System.setProperty("android.package", BuildConfig.APPLICATION_ID);
        System.setProperty("android.manifest", module + manifestPath);
        System.setProperty("android.resources", module + "build/intermediates/res/" + buildVariant);
        System.setProperty("android.assets", module + "build/intermediates/assets/" + buildVariant);
    }
}
