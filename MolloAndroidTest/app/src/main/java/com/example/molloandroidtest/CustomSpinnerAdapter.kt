package com.example.molloandroidtest

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomSpinnerAdapter(context: Context, val icons: List<Int>, val currencies: List<String>) :
    ArrayAdapter<String>(context, R.layout.spinner_item,currencies) {
    @SuppressLint("InflateParams")
    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val row = inflater.inflate(R.layout.spinner_item, null)
        val abbr: TextView = row.findViewById(R.id.country_currency)
        val icon: ImageView = row.findViewById(R.id.country_icon)

        abbr.text = currencies[position]
        icon.setImageResource(icons[position])

        return row
    }

    @SuppressLint("ViewHolder", "InflateParams")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val row = inflater.inflate(R.layout.spinner_item, null)
        val abbr: TextView = row.findViewById(R.id.country_currency)
        val icon: ImageView = row.findViewById(R.id.country_icon)

        abbr.text = currencies[position]
        icon.setImageResource(icons[position])

        return row
    }
}