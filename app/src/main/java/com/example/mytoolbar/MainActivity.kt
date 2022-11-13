package com.example.mytoolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
            when(item.itemId){
                R.id.toolbarAddContact -> Toast.makeText(this, "Anda menekan icon Add Contact", Toast.LENGTH_LONG).show()
                R.id.toolbarFavourite -> Toast.makeText(this, "Anda menekan icon Favourite", Toast.LENGTH_LONG).show()
                R.id.toolbarSetting -> Toast.makeText(this, "Anda menekan icon Setting", Toast.LENGTH_LONG).show()
                R.id.toolbarFeedback -> Toast.makeText(this, "Anda menekan icon Feedback", Toast.LENGTH_LONG).show()
                R.id.toolbarClose -> finish()
            }
        return true
    }
}