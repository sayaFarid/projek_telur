package com.example.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.ActionBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.setDisplayShowTitleEnabled(false)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setLogo(R.drawable.ic_back)
        supportActionBar?.setDisplayUseLogoEnabled(true)
        }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    }
