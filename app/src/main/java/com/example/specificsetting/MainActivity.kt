package com.example.specificsetting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings.*
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//      inisialisasi button
        val btnWireless = findViewById<Button>(R.id.btnWireless)
        val btnWifi = findViewById<Button>(R.id.btnWifi)
        val btnBluetooth = findViewById<Button>(R.id.btnBluetooth)
        val btnDate = findViewById<Button>(R.id.btnDate)
        val btnInputMethod = findViewById<Button>(R.id.btnInputMethod)
        val btnDisplay = findViewById<Button>(R.id.btnDisplay)
        val btnLocation = findViewById<Button>(R.id.btnLocation)
//        memulai intent
        btnWireless.setOnClickListener {
            val i = Intent(ACTION_WIRELESS_SETTINGS)
            startActivity(i)
        }
        btnWifi.setOnClickListener {
            val i = Intent(ACTION_WIFI_SETTINGS)
            startActivity(i)
        }
        btnBluetooth.setOnClickListener {
            val i = Intent(ACTION_BLUETOOTH_SETTINGS)
            startActivity(i)
        }
        btnDate.setOnClickListener {
            val i = Intent(ACTION_DATE_SETTINGS)
            startActivity(i)
        }
        btnInputMethod.setOnClickListener {
            val i = Intent(ACTION_INPUT_METHOD_SETTINGS)
            startActivity(i)
        }
        btnDisplay.setOnClickListener {
            val i = Intent(ACTION_DISPLAY_SETTINGS)
            startActivity(i)
        }
        btnLocation.setOnClickListener {
            val i = Intent(ACTION_LOCATION_SOURCE_SETTINGS)
            startActivity(i)
        }
    }
}