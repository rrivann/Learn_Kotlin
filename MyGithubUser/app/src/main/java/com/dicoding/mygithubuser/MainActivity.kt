package com.dicoding.mygithubuser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.commit
import com.dicoding.mygithubuser.databinding.ActivityMainBinding
import com.dicoding.mygithubuser.ui.SettingFragment

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.option_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.search_fragment -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, SettingFragment())
                    .addToBackStack(null)
                    .commit()
                true
            }
            else -> true
        }
    }
}