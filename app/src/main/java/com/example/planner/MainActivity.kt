package com.example.planner

import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)

        val list = ArrayList<String>()
        list.add("Next Week")
        list.add("Next Month")
        list.add("Next Year")
        list.add("5 Years")
        list.add("10 Years")

        val arrayAdapter: ArrayAdapter<*>
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, list)

        listView.adapter = arrayAdapter

        listView.onItemClickListener =
            AdapterView.OnItemClickListener { _, _, _, _ ->
                val dialog = OpenDialog()
                dialog.show(supportFragmentManager, "game")
            }

        val button = findViewById<Button>(R.id.fab)
        button.setOnClickListener {
            val alert = ViewDialog()
            alert.showDialog(layoutInflater.inflate(R.layout.dropdowndialog,null),  applicationContext)
        }
    }
}
