package com.example.a4_sahilshah

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.a4_sahilshah.data.Place

class LandmarkAdapter(
    private val landmarks: List<Place>
): Adapter<LandmarkAdapter.LandmarkViewHolder>() {
    inner class LandmarkViewHolder(view: View) : ViewHolder(view) {
        val imgView : ImageView
        val textView: TextView
        //val layout: LinearLayout
        init {
            imgView = view.findViewById(R.id.ivImage)
            textView = view.findViewById(R.id.tvCategory)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.category_type_view, parent,false)
        return LandmarkViewHolder(view)
    }

    override fun getItemCount(): Int {
       return landmarks.size
    }

    override fun onBindViewHolder(holder: LandmarkViewHolder, position: Int) {

        val place = landmarks[position]
        holder.textView.text = place.name
        holder.imgView.setImageResource(place.img)
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context,MapsActivity::class.java)
            intent.putExtra("LANDMARK_NAME",place.name)
            intent.putExtra("LATITUDE",place.latitude.toString().toDouble())
            intent.putExtra("LONGITUDE",place.longitude.toString().toDouble())
            holder.itemView.context.startActivity(intent)
            }
        }

}