package com.example.projek_uas

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class hewankuAdapter(private val context: Context, private val hewanku: List<hewanku>, val listener: (hewanku)-> Unit)
    : RecyclerView.Adapter<hewankuAdapter.hewankuViewHolder>(){
    class hewankuViewHolder(view: View): RecyclerView.ViewHolder(view){

        val imghewanku = view.findViewById<ImageView>(R.id.img_item_photo)
        val namehewanku = view.findViewById<TextView>(R.id.tv_item_name)
        val deschewanku = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(hewanku: hewanku, listener: (hewanku) ->Unit) {
            imghewanku.setImageResource(hewanku.imghewanku)
            namehewanku.text = hewanku.namehewanku
            deschewanku.text = hewanku.deschewanku
            itemView.setOnClickListener{
                listener(hewanku)}
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): hewankuViewHolder {
        return hewankuViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_hewanku, parent, false)
        )
    }

    override fun onBindViewHolder(holder: hewankuViewHolder, position: Int) {
        holder.bindView(hewanku [position], listener)
    }

    override fun getItemCount(): Int = hewanku.size
}