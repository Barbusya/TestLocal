package com.bbbrrr8877.android.testlocal.mockito

import android.content.Context
import junit.framework.TestCase
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.kotlin.mock
import com.bbbrrr8877.android.testlocal.R
import org.mockito.Mockito


class UriValidatorTest : TestCase() {

    lateinit var uriValidator: UriValidator
    private val mockContext = mock<Context>()

    @BeforeEach
    public override fun setUp() {
        Mockito.`when`(mockContext.getString(R.string.nothing)).thenReturn("Nothing")
        Mockito.`when`(mockContext.getString(R.string.url)).thenReturn("URL")
        Mockito.`when`(mockContext.getString(R.string.file)).thenReturn("File")
        uriValidator = UriValidator(mockContext)

    }

    @Test
    fun testValidate() {
        println("context get string url = " + mockContext.getString(R.string.url))
        println("context get string file = " + mockContext.getString(R.string.file))
        println("context get string nothing = " + mockContext.getString(R.string.nothing))
    }
}