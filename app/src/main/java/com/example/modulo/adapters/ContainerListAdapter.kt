package com.example.modulo.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.modulo.databinding.ContainerListItemBinding
import com.example.modulo.models.Container

class ContainerListAdapter(private val containerList: List<Container>): RecyclerView.Adapter<ContainerListAdapter.ViewHolder>() {
    lateinit var onContainerClick: (Container) -> Unit
    inner class ViewHolder(private val binding: ContainerListItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(container: Container){
            binding.containerId.text = container.id.toString()
            binding.nameContainer.text = container.name
            binding.origenContainer.text = container.origen
            binding.destinoContainer.text = container.destino
            binding.root.setOnClickListener(){
                if(::onContainerClick.isInitialized)
                    onContainerClick(container)
                else
                    Log.i("edgContainerAdapter","the onContainerClick is not initializated")
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ContainerListItemBinding.inflate(LayoutInflater.from(parent.context))

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(containerList[position])
    }

    override fun getItemCount(): Int {
        return containerList.count()
    }
}