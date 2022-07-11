package com.bbbrrr8877.android.testlocal.utils

import junit.framework.TestCase
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ConvertUtilsTest : TestCase() {

    @Test
    fun testStringToInteger() {
        Assertions.assertEquals(2, ConvertUtils.stringToInteger("2"))
        Assertions.assertEquals(-2, ConvertUtils.stringToInteger("-2"))
        Assertions.assertEquals(0, ConvertUtils.stringToInteger(""))
        Assertions.assertEquals(0, ConvertUtils.stringToInteger("a"))
    }
}