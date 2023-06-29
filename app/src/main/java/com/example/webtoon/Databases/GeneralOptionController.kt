package com.example.webtoon.Databases

import android.content.Context
import android.content.SharedPreferences

object GeneralOptionController {
    val ACCOUNT = "unique_string"

    fun setToken(ctx: Context, id: String) {
        val pre: SharedPreferences = ctx.getSharedPreferences(ACCOUNT, Context.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = pre.edit()
        editor.putString("u_token", id)
        editor.commit()
    }

    fun getToken(ctx: Context): String? {
        val pre: SharedPreferences = ctx.getSharedPreferences(ACCOUNT, Context.MODE_PRIVATE)
        return pre.getString("u_token", "")
    }

    fun clearToken(ctx: Context) {
        val pre: SharedPreferences = ctx.getSharedPreferences(ACCOUNT, Context.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = pre.edit()
        editor.clear()
        editor.commit()
    }
}