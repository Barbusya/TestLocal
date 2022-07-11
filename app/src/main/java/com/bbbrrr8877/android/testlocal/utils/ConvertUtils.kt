package com.bbbrrr8877.android.testlocal.utils

import java.lang.NumberFormatException

class ConvertUtils {

    companion object {
        fun stringToInteger(s: String): Int {
            var result: Int = 0

            try {
                result = s.toInt()
            } catch (e: NumberFormatException) {
                e.printStackTrace()
            }

            return result
        }
    }
}