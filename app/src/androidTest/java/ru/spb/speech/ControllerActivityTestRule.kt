package ru.spb.speech

import android.support.test.rule.ActivityTestRule
import android.app.Activity


class ControlledActivityTestRule<T : Activity> : ActivityTestRule<T> {
    constructor(activityClass: Class<T>) : super(activityClass, false)

    fun relaunchActivity() {
        finishActivity()
        launchActivity()
    }

    private fun launchActivity() {
        launchActivity(activityIntent)
    }
}