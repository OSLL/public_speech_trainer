package com.example.company.myapplication

import android.preference.PreferenceManager
import android.support.test.InstrumentationRegistry
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.*
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.intent.rule.IntentsTestRule
import android.support.test.espresso.matcher.ViewMatchers.hasTextColor
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.runner.AndroidJUnit4
import android.support.test.uiautomator.UiDevice
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class AdditionalCountdownTest {
    @Rule
    @JvmField
    var mIntentsTestRule = IntentsTestRule<StartPageActivity>(StartPageActivity::class.java)


    @Test
    fun Test() {
        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(InstrumentationRegistry.getTargetContext())
        val debSl = sharedPreferences.edit()
        val OnMode = mIntentsTestRule.activity.getString(R.string.deb_pres)

        debSl.putBoolean(OnMode, true).apply()
        debSl.putBoolean(mIntentsTestRule.activity.getString(R.string.test_mode_timer), true).apply()

        onView(withId(R.id.addBtn)).perform(click())
        onView(withId(R.id.addPresentation)).perform(click())

        onView(withId(R.id.trainingTime)).perform(clearText(), typeText(mIntentsTestRule.activity.getString(R.string.testCountDown_time)), closeSoftKeyboard())

        onView(withId(R.id.training)).perform(click())

        val mDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        mDevice.pressBack()

        onView(withId(R.id.time_left)).check(matches(hasTextColor(android.R.color.holo_red_light)))

        debSl.putBoolean(mIntentsTestRule.activity.getString(R.string.test_mode_timer), false).apply()
        debSl.putBoolean(OnMode, false)
        debSl.apply()
    }

}