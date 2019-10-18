package ru.spb.speech

import android.content.ComponentName
import android.support.test.InstrumentationRegistry.getInstrumentation
import android.support.test.InstrumentationRegistry.getTargetContext
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.intent.Intents.intended
import android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent
import android.support.test.espresso.intent.rule.IntentsTestRule
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.runner.AndroidJUnit4
import android.support.test.uiautomator.UiDevice
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import ru.spb.speech.R.string.*

@RunWith(AndroidJUnit4::class)
class StartPageActivityTest : BaseInstrumentedTest() {

    @Rule
    @JvmField
    var mIntentsTestRule = IntentsTestRule<StartPageActivity>(StartPageActivity::class.java)

    lateinit var helper: TestHelper

    @Before
    fun enableDebugMode() {
        helper = TestHelper(mIntentsTestRule.activity)
        helper.setTrainingPresentationMod(true) // включение тестовой презентации
    }

    @After
    fun disableDebugMode() {
        helper.setTrainingPresentationMod(false) // выключение тестовой презентации
    }

    @Test
    fun buttonsExist() {
        onView(withId(R.id.addBtn)).check(matches(isDisplayed()))
    }

    @Test
    fun testFromStartPageToPreference(){
        openActionBarOverflowOrOptionsMenu(getInstrumentation().targetContext)
        onView(withText(activity_preference)).perform(click())
        intended(hasComponent(ComponentName(getTargetContext(), SettingsActivity::class.java)))
    }

    @Test
    fun testFromStartPageToVideoInstruction(){
        openActionBarOverflowOrOptionsMenu(getInstrumentation().targetContext)
        onView(withText(video_instruction)).check(matches(isDisplayed()))
    }

    @Test
    fun testFromStartPageToFeedback(){
        openActionBarOverflowOrOptionsMenu(getInstrumentation().targetContext)
        onView(withText(feedback)).check(matches((isDisplayed())))
    }

    @Test
    fun testFromStartPageToOpenFileDialog(){
        onView(withId(R.id.addBtn)).perform(click())
        UiDevice.getInstance(getInstrumentation()).pressBack()
        intended(hasComponent(ComponentName(getTargetContext(), CreatePresentationActivity::class.java)))
    }
}