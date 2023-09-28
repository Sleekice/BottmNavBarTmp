package com.example.bottmnavbartmp.ui.dashboard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bottmnavbartmp.R
import com.example.bottmnavbartmp.databinding.DashboardUserBinding
import com.example.bottmnavbartmp.databinding.ItemUserBinding
import com.example.bottmnavbartmp.ui.home.HomeAdapter
import java.io.FileDescriptor

class DashboardAdapter(private val getData: DashboardViewModel):
    RecyclerView.Adapter<DashboardAdapter.DashBoardViewHolder>() {


    class DashBoardViewHolder(view: View) : RecyclerView.ViewHolder(view) {



        private val binding = DashboardUserBinding.bind(view)
        fun setupUI( title:String, description: String, image:Int ) {
            binding.title.text = title
            binding.shortText.text = description
            binding.image.setImageResource(image)
        }



    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DashBoardViewHolder {
        return DashBoardViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.dashboard_user, parent, false)
        )
    }

   override fun getItemCount() = getData.getTitle().size

    override fun onBindViewHolder(holder: DashBoardViewHolder, position: Int) {
                    holder.setupUI(
                        getData.getTitle().elementAt(position),
                        getData.getDescription().elementAt(position),
                        getData.getImages().elementAt(position)
                    )

    }
}



