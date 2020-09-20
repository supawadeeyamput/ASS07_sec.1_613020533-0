package com.example.ass07
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.emp_item_layout.view.*

class ViewHolder(view:View):RecyclerView.ViewHolder(view) {
    val tv_name = view.tv_name
    val tv_gender = view.tv_gender
    val tv_email = view.tv_email
    val tv_salary = view.tv_salary
}