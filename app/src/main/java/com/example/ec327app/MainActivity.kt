package com.example.ec327app

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //switching between fragments
        //val menuScreen = MainMenuFragment()
        //val homeScreen = HomeScreenFragment()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.mainContainer, HomeScreenFragment())
            addToBackStack(null)
            commit()

        }

        val btnMainMenu: Button = findViewById(R.id.btnMenu)
        btnMainMenu.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.mainContainer, MainMenuFragment())
                addToBackStack(null)
                commit()
            }
        }

        }
    }




   /* override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }*/
