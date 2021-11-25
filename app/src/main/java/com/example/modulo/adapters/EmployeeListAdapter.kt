package com.example.modulo.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.modulo.databinding.EmployeeListItemBinding
import com.example.modulo.models.Employee

class EmployeeListAdapter(private val EmployeeList: List<Employee>): RecyclerView.Adapter<EmployeeListAdapter.ViewHolder>() {
    lateinit var onEmployeeClick: (Employee) -> Unit
    inner class ViewHolder(private val binding: EmployeeListItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(employee: Employee){
            binding.employeeId.text = employee.id.toString()
            binding.nameEmployee.text = employee.name
            binding.areaEmployee.text = employee.area
            binding.curpEmployee.text = employee.curp
            binding.root.setOnClickListener(){
                if(::onEmployeeClick.isInitialized)
                    onEmployeeClick(employee)
                else
                    Log.i("edgEmployeeAdapter","the onEmployeeClick is not initializated")
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = EmployeeListItemBinding.inflate(LayoutInflater.from(parent.context))

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(EmployeeList[position])
    }

    override fun getItemCount(): Int {
        return EmployeeList.count()
    }


}