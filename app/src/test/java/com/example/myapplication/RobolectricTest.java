package com.example.myapplication;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(RobolectricTestRunner.class)
public class RobolectricTest {
    @Test
    public void testIt() {
        // failing test gives much better feedback
        // to show that all works correctly ;)
        assertThat(Robolectric.application, nullValue());
    }
}
