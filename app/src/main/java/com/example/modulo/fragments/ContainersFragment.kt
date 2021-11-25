package com.example.modulo.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.modulo.R
import com.example.modulo.activities.DetailActivity
import com.example.modulo.activities.main.MainActivity
import com.example.modulo.adapters.ContainerListAdapter
import com.example.modulo.databinding.ActivityMainBinding
import com.example.modulo.databinding.FragmentContainersBinding
import com.example.modulo.models.Container

class ContainersFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding  = FragmentContainersBinding.inflate(inflater, container, false)
        val containerList = mutableListOf<Container>(
            Container(34720,"Contenedor Amazon","Manzanillo, Colima","Shanghai, China","30,480 KG", "70%", "27 °C", "28 °C"),
            Container(42345,"Contenedor Mercado Libre","Long Beach, California","Shanghai, China","30,480 KG", "65%", "30°C", "34 °C"),
            Container(65189,"Contenedor Alibaba","Hong Kong, China","Veracruz, Veracruz","30,480 KG", "60%", "35 °C", "47 °C"),
            Container(74680,"Contenedor Volkswagen","Hamburgo, Alemania","Tanjung Pelepas, Malasia","30,480 KG", "65%", "38°C", "58 °C"),
            Container(23483,"Contenedor Amiami","Amberes, Bélgica","Xiamen, China","30,480 KG", "55%", "34°C", "41°C"),

            )

        val containerListAdapter = ContainerListAdapter(containerList)

        binding.containerList.layoutManager = LinearLayoutManager(activity)
        binding.containerList.adapter = containerListAdapter
        containerListAdapter.onContainerClick = {
            val intent = Intent(activity, DetailActivity::class.java).apply {
                putExtra(DetailActivity.CONTAINER_KEY, it)
            }
            startActivity(intent)
        }

        return binding.root


    }


    companion object {

        @JvmStatic fun newInstance() = ContainersFragment()

    }
}