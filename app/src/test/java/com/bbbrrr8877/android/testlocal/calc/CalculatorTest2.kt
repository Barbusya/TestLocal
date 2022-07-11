package com.bbbrrr8877.android.testlocal.calc

import junit.framework.TestCase
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class CalculatorTest2 : TestCase() {

    lateinit var calculator: Calculator

    @BeforeEach
    public override fun setUp() {
        println("\r\nsetUp")
        calculator = Calculator()
    }

    @AfterEach
    public override fun tearDown() {
        println("tearDown")
    }

    @Test
    fun testAdd2() {
        println("add")
        Assertions.assertEquals(9, calculator.add(6,3))
    }
}