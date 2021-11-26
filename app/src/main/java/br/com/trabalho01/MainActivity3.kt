package br.com.trabalho01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val arrayValores = arrayOf(120000.00, 240000.00, 480000.00, 600000.00, 800000.00)
        //arrastar imagem redimensionada para a pasta res/drawable
        val arrayImagens = arrayOf(R.drawable.casa1, R.drawable.casa2, R.drawable.casa3, R.drawable.casa4, R.drawable.casa5)


        val meuAdapter = CustomAdapter(this,arrayValores, arrayImagens)
        val listCarros = findViewById(R.id.idListViewImoveis) as ListView
        listCarros.adapter = meuAdapter

        listCarros.setOnItemClickListener() { adapterView, view, position, id ->
            Toast.makeText(this, position.toString(), Toast.LENGTH_LONG).show()
            val intent = Intent(this, MainActivity4::class.java)
            intent.putExtra("posicao", position)
            startActivity(intent)
        }
    }
}