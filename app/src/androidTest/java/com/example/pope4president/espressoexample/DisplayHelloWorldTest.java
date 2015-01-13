package com.example.pope4president.espressoexample;

import android.test.ActivityInstrumentationTestCase2;

public class DisplayHelloWorldTest extends ActivityInstrumentationTestCase2<MainActivity> {
    public DisplayHelloWorldTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void testHelloWorldDisplay() {
        onView(withId(R.id.hello_world)).check(matches(withText(R.string.hello_world)));
    }
}
