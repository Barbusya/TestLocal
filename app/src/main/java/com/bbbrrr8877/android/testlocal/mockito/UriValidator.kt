package com.bbbrrr8877.android.testlocal.mockito

import android.content.Context
import com.bbbrrr8877.android.testlocal.R
import java.net.URI

class UriValidator(val context: Context) {

    fun validate(uri: String) : String{

        var resId = R.string.nothing
        if (isUri(uri)) {
            resId = R.string.url
        } else if (isFile(uri)) {
            resId = R.string.file
        }
        return context.getString(resId)
    }

    private fun isUri(uri: String): Boolean {
        return "http".equals(URI.create(uri).scheme)
    }

    private fun isFile(uri: String) : Boolean {
        return "file".equals(URI.create(uri).scheme)
    }
}