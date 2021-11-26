package br.com.trabalho01

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(val context: Activity, private val valorImovel: Array<Double>, private val imgIdImovel:Array<Int>) : ArrayAdapter<Double>(context, R.layout.custom_listview,valorImovel){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val view = inflater.inflate(R.layout.custom_listview, null, true)
        val textView_Nome = view.findViewById(R.id.tv_Valor) as TextView
        val imageView_carro = view.findViewById(R.id.imgImovel) as ImageView

        textView_Nome.text = valorImovel[position].toString()
        imageView_carro.setImageResource(imgIdImovel[position])

        return view
    }

}