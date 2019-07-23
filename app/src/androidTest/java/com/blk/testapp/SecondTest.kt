package com.blk.testapp

import android.support.test.InstrumentationRegistry
import android.support.test.espresso.Espresso
import android.support.test.espresso.Espresso.*
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.runner.AndroidJUnit4
import com.blk.testapp.base.ConcreteApplicationTest
import org.hamcrest.Matchers
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class SecondTest : ConcreteApplicationTest<LoginActivity>(LoginActivity::class.java) {

    @Before
    fun setUp(){
        launch()
    }
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        Assert.assertEquals("com.blk.testapp", appContext.packageName)
    }

    @Test
    fun fillFields(){
        onView(Matchers.allOf(ViewMatchers.withId(R.id.email), ViewMatchers.isCompletelyDisplayed()))
            .perform(ViewActions.typeText("Second Zalupa"))
        onView(Matchers.allOf(ViewMatchers.withId(R.id.password), ViewMatchers.isCompletelyDisplayed()))
            .perform(ViewActions.typeText("Snova Konskaya"))
        onView(
            Matchers.allOf(
                ViewMatchers.withId(R.id.email_sign_in_button),
                ViewMatchers.isCompletelyDisplayed()
            )
        ).perform(ViewActions.click())


    }

    @Test
    fun ololo() {
        Espresso.onView(Matchers.allOf(ViewMatchers.withId(R.id.password), ViewMatchers.isCompletelyDisplayed()))
            .perform(ViewActions.typeText("OLOLO"))
    }

}




