package com.example.project_pas_ganjilandroid.UI


import android.content.res.TypedArray
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import com.example.project_pas_ganjilandroid.Adapter.AdapterHome
import com.example.project_pas_ganjilandroid.Modl

import com.example.project_pas_ganjilandroid.R

/**
 * A simple [Fragment] subclass.
 */
class FragmentHome : Fragment() {

    private lateinit var adapter: AdapterHome
    private lateinit var dataTitle: Array<String>
    private lateinit var dataDesc: Array<String>
    private lateinit var dataPhoto: TypedArray
    private var iitem = arrayListOf<Modl>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_fragment_home, container, false)

        val listView: ListView = view.findViewById(R.id.lvihome)
        adapter = AdapterHome(view.context)
        listView.adapter = adapter

        dataTitle = resources.getStringArray(R.array.title_home)
        dataDesc = resources.getStringArray(R.array.desc)
        dataPhoto = resources.obtainTypedArray(R.array.photo)

        for (position in dataTitle.indices){
            val nowshowing = Modl(
                dataPhoto.getResourceId(position, -1),
                dataTitle[position],
                dataDesc[position]
            )
            iitem.add(nowshowing)
        }
        adapter.home = iitem

        return view
    }
}
