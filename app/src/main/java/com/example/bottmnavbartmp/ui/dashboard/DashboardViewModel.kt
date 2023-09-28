package com.example.bottmnavbartmp.ui.dashboard

import androidx.annotation.DrawableRes
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.bottmnavbartmp.R

class DashboardViewModel : ViewModel() {


    fun getTitle():List<String>{
        return listOf("Peter",
            "Tiewah",
            "Abdullahi",
            "Munye",
            "Samuel",
            "Bassett",
            "Jermaine",
            "Tucker",
            "Mukarrim",
            "Adam"
        )
    }


    //used to
    fun getDescription() : List<String> {
        return listOf("Peter",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. ",
            "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it ",
            "to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially",
            "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as",
            "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour",
            "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour,",
            "1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very",
            "Shhh, Mukarrim the boss is watching. ",
            "1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very"

        )
    }


    //This is used to populate the images.
     fun getImages( ):List<Int> {
         return listOf(R.drawable.alley,
             R.drawable.caique_nascimento_3ujvzg9i2ei_unsplash,
             R.drawable.cute_lady,
             R.drawable.dashboard_back,
             R.drawable.dicks,
             R.drawable.ic_dashboard_black_24dp,
             R.drawable.ic_home_black_24dp,
             R.drawable.ic_notifications_black_24dp,
             R.drawable.outdoors,
             R.drawable.unsplashg,
             R.drawable.window)

     }



    private val _text = MutableLiveData<String>().apply {
        value = "This is dashboard Fragment"
    }
    val text: LiveData<String> = _text
}