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
import com.example.modulo.activities.main.MainActivity
import com.example.modulo.adapters.EmployeeListAdapter
import com.example.modulo.databinding.FragmentBlankBinding
import com.example.modulo.models.Employee

class BlankFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, employee: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding  = FragmentBlankBinding.inflate(inflater, employee, false)
        val employeeList = mutableListOf<Employee>(
            Employee(20195023,"Juan Perez","HZA/2]C[Zn.);UZP4C","Intendencia"),
            Employee(20166932,"Radames Ramirez","RADR0012101HCMMZDA0","Mantenimiento"),
            Employee(20166916,"Missael Peralta","PEAR010307HCMRRGA3(","Inspección"),
            Employee(20167007,"Cesar Vargas","AEJ1818101KMASDD20","Logística"),
            Employee(51345345,"Porfirio Diaz","vxEHV67ge-a-Yq6}#}","Dictadura"),

            )

        val employeeListAdapter = EmployeeListAdapter(employeeList)

        binding.employeeList.layoutManager = LinearLayoutManager(activity)
        binding.employeeList.adapter = employeeListAdapter


        return binding.root


    }


    companion object {

        @JvmStatic fun newInstance() = BlankFragment()

    }
}