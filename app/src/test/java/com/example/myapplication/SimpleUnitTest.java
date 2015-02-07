package com.example.myapplication;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SimpleUnitTest {
    @Test
    public void checkJUnitWork() {
        // failing test gives much better feedback
        // to show that all works correctly ;)
        assertThat(true, is(false));
    }
}