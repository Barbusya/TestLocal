package com.bbbrrr8877.android.testlocal.calc

import junit.framework.TestCase
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class CalculatorTest : TestCase() {

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
    fun testAdd() {
        println("add")
        Assertions.assertEquals(9, calculator.add(6,3), "Values are not equals")
    }

    @Test
    fun testSubtract() {
        println("subtract")
        Assertions.assertEquals(3, calculator.subtract(6,3))
    }

    @Test
    fun testMultiply() {
        println("multiply")
        Assertions.assertEquals(18, calculator.multiply(6,3))
    }

    @Test
    fun testDivide() {
        println("divide")
        Assertions.assertEquals(2, calculator.divide(6,3))
    }
}