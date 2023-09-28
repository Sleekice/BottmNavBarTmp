package com.example.bottmnavbartmp.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bottmnavbartmp.R
import com.example.bottmnavbartmp.databinding.ItemUserBinding

class HomeAdapter(private val userList: List<String>): RecyclerView.Adapter<HomeAdapter.CustomViewHolder>() {


    class CustomViewHolder(view: View ):RecyclerView.ViewHolder(view) {

        private val binding = ItemUserBinding.bind(view)
        fun setupUI(userName: String, position: Int) {
            binding.textView.text = userName

            if(position % 2 ==0){
                binding.textView.setBackgroundResource(androidx.transition.R.color.material_blue_grey_800)
            }
            else{
                binding.textView.setBackgroundResource(R.color.purple_200)
            }

        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        return CustomViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.item_user,parent,false)
                )

    }

    override fun getItemCount() = userList.size


    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.setupUI(userList[position],position)

    }

}


