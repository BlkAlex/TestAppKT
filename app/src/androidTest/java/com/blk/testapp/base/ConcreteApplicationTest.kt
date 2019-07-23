package com.blk.testapp.base

import android.app.Activity
import android.content.Intent
import android.support.test.rule.ActivityTestRule


open class ConcreteApplicationTest<T : Activity>(clazz: Class<T>) {

    val rule: ActivityTestRule<T>

    init {
        rule = ActivityTestRule(clazz, true, false)
    }

    fun launch(): T {
        return rule.launchActivity(null)
    }

    fun launch(intent: Intent): T {
        return rule.launchActivity(intent)
    }

}