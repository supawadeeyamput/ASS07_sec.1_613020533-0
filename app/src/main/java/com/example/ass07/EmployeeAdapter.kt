package com.example.ass07

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class EmployeeAdapter(val item : List<Employee>, val context: Context):RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view_item = LayoutInflater.from(parent.context).inflate(R.layout.emp_item_layout,parent,false)
        return ViewHolder(view_item)
    }

    override fun getItemCount(): Int {
        return item.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tv_name.text = "Name : "+item[position].name
        holder.tv_gender.text ="Gender : "+item[position].gender
        holder.tv_email.text ="Email : "+item[position].email
        holder.tv_salary.text = "Salary : "+item[position].salary.toString()
    }


}