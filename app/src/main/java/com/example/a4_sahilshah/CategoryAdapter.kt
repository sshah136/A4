package com.example.a4_sahilshah

import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class CategoryAdapter(
    private val categories: List<String>
) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.category_view, parent, false)
        return CategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val category = categories[position]
        holder.tvTitle.text = category
        holder.categoryContainer.setBackgroundColor(Color.LTGRAY)
        holder.tvTitle.setOnClickListener {
            val intent = when (category) {
                "Attractions" -> Intent(holder.itemView.context, AttractionsActivity::class.java)
                "Heritage Buildings" -> Intent(
                    holder.itemView.context,
                    HeritageBuildingsActivity::class.java
                )

                "Museums" -> Intent(holder.itemView.context, MuseumActivity::class.java)
                "Stadiums" -> Intent(holder.itemView.context, StadiumActivity::class.java)
                else -> null
            }
            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return categories.size
    }

    inner class CategoryViewHolder(itemView: View) : ViewHolder(itemView) {
        var tvTitle: TextView = itemView.findViewById(R.id.tv1)
        var categoryContainer: LinearLayout = itemView.findViewById(R.id.category)
    }


    interface RecyclerViewEvent {
        fun onItemClicked(position: Int)

    }
}

