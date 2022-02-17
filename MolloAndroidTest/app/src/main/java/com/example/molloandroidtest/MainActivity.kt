package com.example.molloandroidtest

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var selectCurr1: Spinner
    private lateinit var selectCurr2: Spinner
    private lateinit var currAbbr1: TextView
    private lateinit var currAbbr2: TextView
    private lateinit var firstCurrency: EditText
    private lateinit var secondCurrency: EditText
    private lateinit var convertBtn: Button

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
        currAbbr2 = findViewById(R.id.curr_abbr2)
        firstCurrency = findViewById(R.id.first_currency)
        secondCurrency = findViewById(R.id.second_currency)
        convertBtn = findViewById(R.id.convert_button)
        initDropdown()

    }

    private fun initDropdown(){

        // Initialize first currency selector spinner
        selectCurr1.adapter = CustomSpinnerAdapter(this, icons, currencies)
        selectCurr2.adapter = CustomSpinnerAdapter(this, icons, currencies)

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

        // Initialize second currency selector spinner
        selectCurr2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                currAbbr2.text = currencies[position]
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
//                TODO("Not yet implemented")
            }

        }
    }

    private fun initConversionButton(){
        val cur1 = firstCurrency.text.toString()
        val cur2 = secondCurrency.text.toString()
        convertBtn.setOnClickListener { convertCurrency(cur1,cur2) }

    }

    private fun convertCurrency(firstCurrency: String, secondCurrency: String) {

    }

}