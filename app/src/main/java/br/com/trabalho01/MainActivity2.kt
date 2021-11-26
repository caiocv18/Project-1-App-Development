package br.com.trabalho01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var textViewCEP: TextView
    lateinit var textViewTexto: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var cep = intent.getIntExtra("cep", 0)
        val button_sim = findViewById<Button>(R.id.button_sim)

        textViewCEP = findViewById(R.id.text_view_cep)
        textViewTexto = findViewById(R.id.text_view_texto)

        textViewCEP.text = "CEP: " + cep.toString() + "\n" +
                            "LOCALIDADE: " + "Brasília" + "\n" +
                            "BAIRRO: " + "Taguatinga" + "\n" +
                            "UF: " + "DF"

        textViewTexto.text
        button_sim.setOnClickListener{
            val intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
    }
}