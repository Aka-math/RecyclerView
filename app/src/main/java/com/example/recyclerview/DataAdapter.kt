package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DataAdapter(var data: Array<String>) : RecyclerView.Adapter<DataAdapter.DataViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        var layoutRv = LayoutInflater.from(parent.context).inflate(R.layout.layout_rv,parent,false)
        return DataViewHolder(layoutRv)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(prateekholder: DataViewHolder, position: Int) {
        prateekholder.cbItem.setText(data[position])
    }

    class DataViewHolder(rowPlank:View):RecyclerView.ViewHolder(rowPlank) {
        var cbItem = itemView.findViewById<TextView>(R.id.checkBox)
    }
}