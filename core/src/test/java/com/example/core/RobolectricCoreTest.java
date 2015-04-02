package com.example.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(CustomRobolectricRunner.class)
@Config(constants = BuildConfig.class)
public class RobolectricCoreTest {
    @Test
    public void testIt() {
        CoreFunction function = new CoreFunction();
        String content = function.getContent(RuntimeEnvironment.application);

        // failing test gives much better feedback
        // to show that all works correctly ;)
        assertThat(content, equalTo("Testing Android Rocks!"));
    }
}
