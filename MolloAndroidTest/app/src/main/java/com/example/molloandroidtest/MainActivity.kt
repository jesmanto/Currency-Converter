package com.example.molloandroidtest

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var selectCurr1: Spinner
    private lateinit var selectCurr2: Spinner
    private lateinit var currAbbr1: TextView

    private val currencies = listOf(
        "EUR",
        "USD",
        "NGN",
        "GHC",
        "GBP"
    )

    private val icons = listOf(
        R.drawable.eur,
        R.drawable.eur,
        R.drawable.eur,
        R.drawable.eur,
        R.drawable.eur
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        selectCurr1 = findViewById(R.id.currency1)
        selectCurr2 = findViewById(R.id.currency2)
        currAbbr1 = findViewById(R.id.curr_abbr1)

        selectCurr1.adapter = CustomSpinnerAdapter(this, icons, currencies)
        selectCurr1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                currAbbr1.text = currencies[position]
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
//                TODO("Not yet implemented")
            }

        }
    }

}