package com.lauranyaaga.ewalletmobile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EwalletAdapter (var salaryList: List<SalaryExpenditure>): RecyclerView.Adapter<SalaryViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SalaryViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.cardview, parent, false)
        return SalaryViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return salaryList.size
    }

    override fun onBindViewHolder(holder: SalaryViewHolder, position: Int) {
        val salaryExpenditure = salaryList[position]
        holder.salary.text = salaryExpenditure.descrption
        holder.amount.text = salaryExpenditure.money
        holder.tvdate.text = salaryExpenditure.date
    }
}
class  SalaryViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var salary = itemView.findViewById<TextView>(R.id.salary)
    var amount = itemView.findViewById<TextView>(R.id.amount)
    var tvdate = itemView.findViewById<TextView>(R.id.tvdate)
}