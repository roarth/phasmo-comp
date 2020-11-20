package com.roarth.phasmocomp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val toolbar = findViewById<Toolbar>(R.id.toolbar)
    setSupportActionBar(toolbar)
  }

  override fun onCreateOptionsMenu(menu: Menu?): Boolean {
    menuInflater.inflate(R.menu.toolbar_main, menu)
    return true
  }

  override fun onOptionsItemSelected(item: MenuItem): Boolean {
    return when(item.itemId) {
      R.id.action_ghost -> {
        Toast.makeText(this, R.string.give_sign, Toast.LENGTH_SHORT).show()
        return true
      }
      R.id.action_about -> {
        val intent=  Intent(this, AboutUsActivity::class.java)
        startActivity(intent)
        return true
      }
      else -> super.onOptionsItemSelected(item)
    }
  }

}