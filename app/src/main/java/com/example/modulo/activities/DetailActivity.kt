package com.example.modulo.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.modulo.R
import com.example.modulo.databinding.ActivityDetailBinding
import com.example.modulo.models.Container

class DetailActivity : AppCompatActivity() {
    companion object{
        const val CONTAINER_KEY = "container_item"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val binding = DataBindingUtil.setContentView<ActivityDetailBinding>(this, R.layout.activity_detail)
        val bundle: Bundle? = intent.extras

        if(bundle != null){
            val container = bundle.getParcelable<Container>(CONTAINER_KEY)

            binding.txvID.text = container?.id.toString()
            binding.txvName.text = container?.name
            binding.txvOrigen.text = container?.origen
            binding.txvDestino.text = container?.destino
            binding.txvMGW.text = container?.mgw
            binding.txvHumidity.text = container?.humidity
            binding.txvTemperature.text = container?.temp
            binding.txvHeatIndex.text = container?.heatindex


        }
    }
}