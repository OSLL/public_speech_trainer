package ru.spb.speech

import android.util.Log
import org.junit.Assert
import org.junit.Test
import ru.spb.speech.appSupport.CountingNumberOfWordsParasites

class FunOfCountingWordsParasTest {
    private val countingParasitesHelper = CountingNumberOfWordsParasites()
    private val massOfParWords = arrayOf("короче", "однако", "это", "типа")
    private val listOfParasites = ArrayList<String>()

    @Test
    fun oneWordParasiteTest() {
        Assert.assertEquals(countingParasitesHelper.counting("однако", massOfParWords, listOfParasites), 1)
    }

    @Test
    fun twoWordParasiteTest() {
        Assert.assertEquals(countingParasitesHelper.counting("короче, было проведено исследование типа", massOfParWords, listOfParasites), 2)
    }

    @Test
    fun zeroWordParasitesTest() {
        Assert.assertEquals(countingParasitesHelper.counting("было проведено исследование", massOfParWords, listOfParasites), 0)
    }
}

