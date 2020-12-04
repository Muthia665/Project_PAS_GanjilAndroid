package com.example.project_pas_ganjilandroid.Adapter

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.project_pas_ganjilandroid.Modl
import com.example.project_pas_ganjilandroid.R

class AdapterStore constructor (private val context: Context) : BaseAdapter() {

    internal var store = arrayListOf<Modl>()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var itemView = convertView
        if (itemView == null){
            itemView = LayoutInflater.from(context).inflate(R.layout.list_store, parent, false)
        }

        val viewHolder = ViewHolder(itemView as View)

        val istore = getItem(position) as Modl
        viewHolder.bind(istore)

        return itemView
    }

    private inner class ViewHolder constructor(view: View) {
        private val titleMovie: TextView = view.findViewById(R.id.titleStore)
        private val descMovie: TextView = view.findViewById(R.id.descStore)
        private val imgMovie: ImageView = view.findViewById(R.id.imgStore)

        internal fun bind(nowpos: Modl) {
            titleMovie.text = nowpos.title
            descMovie.text = nowpos.desc
            imgMovie.setImageResource(nowpos.photo)
        }

    }

    override fun getItem(position: Int): Any = store[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getCount(): Int = store.size
}