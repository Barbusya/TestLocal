package com.bbbrrr8877.android.testlocal.mockito

import android.content.Context
import junit.framework.TestCase
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.kotlin.mock
import com.bbbrrr8877.android.testlocal.R
import org.junit.jupiter.api.Assertions
import org.mockito.Mockito

private const val NOTHING = "Nothing"
private const val URL = "URL"
private const val FILE = "File"

class UriValidatorTest : TestCase() {

    lateinit var uriValidator: UriValidator
    private val mockContext = mock<Context>()

    @BeforeEach
    public override fun setUp() {
        Mockito.`when`(mockContext.getString(R.string.nothing)).thenReturn(NOTHING)
        Mockito.`when`(mockContext.getString(R.string.url)).thenReturn(URL)
        Mockito.`when`(mockContext.getString(R.string.file)).thenReturn(FILE)
        uriValidator = UriValidator(mockContext)

    }

    @Test
    fun testValidate() {
        Assertions.assertEquals(uriValidator.validate("http://google.com"), URL)
        Assertions.assertEquals(uriValidator.validate("file://sdcard/DCIM/img001.jpg"), FILE)
        Assertions.assertEquals(uriValidator.validate("bla-bla-bla"), NOTHING)
    }
}