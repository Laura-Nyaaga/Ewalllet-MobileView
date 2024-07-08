package com.lauranyaaga.ewalletmobile

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.lauranyaaga.ewalletmobile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvDisplay.layoutManager = LinearLayoutManager(this)
        displaySalaries()

    }
    fun displaySalaries(){
        val salaries1 = SalaryExpenditure("Salary", "KES 204567", "2 July 2024")
        val salaries2 = SalaryExpenditure( "Rent", "KES 478800", "3 July 2024")
        val salaries3 = SalaryExpenditure("Dividends", "KES 5609937", "4 July 2024")
        val salaries4 = SalaryExpenditure("Rent", "KES 397645", "5 July 2024")
        val salaries15= SalaryExpenditure("Shopping", "KES 876523", "6 July 2024")
        val salaryList = listOf(salaries1, salaries2, salaries3, salaries4, salaries15)
        val ewalletAdapter = EwalletAdapter(salaryList)
        binding.rvDisplay.adapter = ewalletAdapter
    }

}