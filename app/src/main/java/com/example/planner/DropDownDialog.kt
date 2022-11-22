package com.example.planner

import android.R
import android.app.Dialog
import android.content.Context
import android.view.View
import android.view.Window
import android.widget.ArrayAdapter

import android.widget.Spinner


class ViewDialog {
    fun showDialog(view: View, context: Context) {
        val dialog = Dialog(view.context)

        val dropdown: Spinner? = view.findViewById(com.example.planner.R.id.planets_spinner)

        val list = ArrayList<String>()
        list.add("Next Week")
        list.add("Next Month")
        list.add("Next Year")
        list.add("5 Years")
        list.add("10 Years")

        val arrayAdapter: ArrayAdapter<*>
        arrayAdapter = ArrayAdapter(context, R.layout.simple_spinner_dropdown_item, list)

        dropdown?.adapter = arrayAdapter
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(true)
        dialog.setTitle("Set New Goal")
        dialog.setContentView(com.example.planner.R.layout.dropdowndialog)
        dialog.show()
    }
}