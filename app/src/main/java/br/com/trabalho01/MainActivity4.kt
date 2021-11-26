package br.com.trabalho01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity4 : AppCompatActivity() {

    lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        imageView = findViewById(R.id.image_view_imovel)

        val posicao:Int = intent.getIntExtra("posicao", -1)

        if(posicao == 0){
            imageView.setImageResource(R.drawable.casa1large)
        }else if (posicao == 1){
            imageView.setImageResource(R.drawable.casa2large)
        }else if (posicao == 2){
            imageView.setImageResource(R.drawable.casa3large)
        }else if (posicao == 3){
            imageView.setImageResource(R.drawable.casa4large)
        }else{
            imageView.setImageResource(R.drawable.casa5large)
        }

    }
}