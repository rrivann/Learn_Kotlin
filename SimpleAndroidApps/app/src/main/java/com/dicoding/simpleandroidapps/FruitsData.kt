package com.dicoding.simpleandroidapps

object FruitsData {
    private val fruitsName = arrayOf(
        "Mangga",
        "Apel",
        "Semangka",
        "Anggur",
        "Pisang",
        "Jeruk",
        "Buah Naga",
        "Nangka",
        "Jambu",
        "Belimbing"
    )

    private val fruitsImages =
        intArrayOf(
            R.drawable.mangga,
            R.drawable.apel,
            R.drawable.semangka,
            R.drawable.anggur,
            R.drawable.pisang,
            R.drawable.jeruk,
            R.drawable.buah_naga,
            R.drawable.nangka,
            R.drawable.jambu,
            R.drawable.belimbing
        )

    val listData : ArrayList<Fruits>
        get() {
            val list = arrayListOf<Fruits>()
            for (position in fruitsName.indices){
                val fruits = Fruits()
                fruits.name = fruitsName[position]
                fruits.picture = fruitsImages[position]
                list.add(fruits)
            }
            return list
        }
}