package com.example.masmasfoodapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.masmasfoodapp.Adapter.ProfilemenuAdapter
import com.example.masmasfoodapp.Adapter.popular_menuAdapter
import com.example.masmasfoodapp.model.ProfileMenuModel
import com.example.masmasfoodapp.model.popular_menu


class ProfileFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_profile, container, false)
        val profile_recyleview=view?.findViewById<RecyclerView>(R.id.profile_recyleview)
            profile_recyleview?.layoutManager= LinearLayoutManager(context)
        val data7=ArrayList<ProfileMenuModel>()
        data7.add(ProfileMenuModel(R.drawable.menu_pic,"Spacy fresh crab","Waroenk kita","\$ 35","Buy Again"))
        data7.add(ProfileMenuModel(R.drawable.menu_pic,"Spacy fresh crab","Waroenk kita","\$ 35","Buy Again"))
        data7.add(ProfileMenuModel(R.drawable.menu_pic,"Spacy fresh crab","Waroenk kita","\$ 35","Buy Again"))
        data7.add(ProfileMenuModel(R.drawable.menu_pic,"Spacy fresh crab","Waroenk kita","\$ 35","Buy Again"))
        val adapter1= ProfilemenuAdapter(data7)
        profile_recyleview?.adapter=adapter1
        return view
    }


    }
