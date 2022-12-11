package com.dicoding.simpleandroidapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvFruits: RecyclerView
    private var list: ArrayList<Fruits> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Buah - Buahan"

        rvFruits = findViewById(R.id.rv_fruits)
        rvFruits.setHasFixedSize(true)
        list.addAll(FruitsData.listData)
        showRecyclerList()
    }


    private fun showRecyclerList() {
        rvFruits.layoutManager = LinearLayoutManager(this)
        val listFruitsAdapter = ListFruitsAdapter(list)
        rvFruits.adapter = listFruitsAdapter


        listFruitsAdapter.setOnItemClickCallback(object : ListFruitsAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Fruits) {
                showSelectedHero(data)
            }
        })

    }


    private fun showSelectedHero(hero: Fruits) {
        Toast.makeText(this, "Kamu memilih " + hero.name, Toast.LENGTH_SHORT).show()
    }
}