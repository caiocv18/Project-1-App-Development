package br.com.trabalho01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {

    lateinit var textViewCEP: TextView
    lateinit var checkBox: CheckBox
    lateinit var sharedPreference : SharedPreference
    var cep by Delegates.notNull<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_buscar = findViewById<Button>(R.id.button_buscar)

        cep = 0
        sharedPreference  = SharedPreference(this)
        textViewCEP = findViewById(R.id.edit_text_cep)
        checkBox = findViewById(R.id.checkbox_salvar)

        button_buscar.setOnClickListener{
            //Toast.makeText(this, textViewCEP.text.toString(), Toast.LENGTH_LONG).show()


            cep = if(checkBox.isChecked){
                sharedPreference.getValue("cep")
            }else{
                textViewCEP.text.toString().toInt()
            }

            if(cep != -1){
                val intent = Intent(this,MainActivity2::class.java)
                intent.putExtra("cep", cep)
                startActivity(intent)
            }else{
                //nada por enquanto
            }

        }
    }

    fun onCheckboxClicked(view: View) {
        if(cep != 0){
            val cep = findViewById<EditText>(R.id.edit_text_cep).text.toString().toInt()
            sharedPreference.save("cep", cep)
        }
    }
}