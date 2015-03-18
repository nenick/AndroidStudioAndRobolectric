package com.example.core;

import org.junit.runners.model.InitializationError;
import org.robolectric.RobolectricTestRunner;

public class CustomRobolectricRunner extends RobolectricTestRunner {
    public CustomRobolectricRunner(Class<?> testClass) throws InitializationError {
        super(testClass);
        String buildVariant = (BuildConfig.FLAVOR.isEmpty() ? "" : BuildConfig.FLAVOR+ "/") + BuildConfig.BUILD_TYPE;
        String intermediatesPath = BuildConfig.class.getResource("").toString().replace("file:", "");
        if(intermediatesPath.contains("/classes/")) {
            intermediatesPath = intermediatesPath.substring(0, intermediatesPath.indexOf("/classes"));
        } else {
            intermediatesPath = intermediatesPath.substring(0, intermediatesPath.indexOf("/bundles")).replace("jar:", "");
        }

        System.setProperty("android.package", BuildConfig.APPLICATION_ID);
        System.setProperty("android.manifest", intermediatesPath + "/bundles/" + buildVariant + "/AndroidManifest.xml");
        System.setProperty("android.resources", intermediatesPath + "/res/" + buildVariant);
        System.setProperty("android.assets", intermediatesPath + "/assets/" + buildVariant);
    }
}
