package br.com.trabalho01

import android.content.Context
import android.content.SharedPreferences
import android.widget.EditText

class SharedPreference(context: Context) {

    private val PREFERENCE_NAME = "TRABALHO01"
    val sharedPreference: SharedPreferences = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)

    fun save(key_name: String, cep: Int){
        val editor: SharedPreferences.Editor = sharedPreference.edit()
        editor.putInt(key_name, cep)
        editor.commit()
    }

    fun getValue(key_name: String) : Int {
        return sharedPreference.getInt(key_name, -1)
    }

    fun removeValue(key_name: String) {
        val editor: SharedPreferences.Editor = sharedPreference.edit()
        editor.remove(key_name)
        editor.commit()
    }

}