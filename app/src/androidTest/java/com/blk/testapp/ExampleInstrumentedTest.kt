package com.blk.testapp

import android.support.test.InstrumentationRegistry
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.ViewAction
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.matcher.ViewMatchers.isCompletelyDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.runner.AndroidJUnit4
import com.blk.testapp.base.ConcreteApplicationTest
import org.hamcrest.Matchers.allOf

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Before

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest : ConcreteApplicationTest<LoginActivity>(LoginActivity::class.java) {

    @Before
    fun setUp(){
        launch()
    }
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("com.blk.testapp", appContext.packageName)
    }

    @Test
    fun fillFields(){
        onView(allOf(withId(R.id.email), isCompletelyDisplayed())).perform(ViewActions.typeText("ZALUPA"))
        onView(allOf(withId(R.id.password), isCompletelyDisplayed())).perform(ViewActions.typeText("Konskaya"))
        onView(allOf(withId(R.id.email_sign_in_button), isCompletelyDisplayed())).perform(click())
    }

    @Test
    fun fillFieldEmail(){
        onView(allOf(withId(R.id.email), isCompletelyDisplayed())).perform(ViewActions.typeText("Email Zalupi"))
    }
}


