package com.example.pope4president.espressoexample;

import android.test.ActivityInstrumentationTestCase2;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

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
        onView(withId(R.id.hello_world))
            .perform(click());
        onView(withId(R.id.whats_the_haps))
            .check(matches(withText(R.string.whats_the_haps)));
    }
}
