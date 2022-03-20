package com.example.recviewexample

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recviewexample.models.FoodModel

class MainAdapter(
    private val foodModelList: MutableList<FoodModel>,
    private val onItemClick: (foodModel: FoodModel) -> Unit
) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.food_item, parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val tempUserModel = foodModelList[position]
        holder.bind(tempUserModel)
    }

    override fun getItemCount(): Int = foodModelList.size
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvFirstName = itemView.findViewById<TextView>(R.id.name)
        val imgAvatar = itemView.findViewById<ImageView>(R.id.image)
        fun bind(foodModel: FoodModel) {
            tvFirstName.text = foodModel.firstName
            imgAvatar.setImageResource(foodModel.imageId)
            imgAvatar.setOnClickListener {
                onItemClick.invoke(foodModel)
            }
            tvFirstName.setOnClickListener{
                onItemClick.invoke(foodModel)
            }
        }
    }
}
