package com.example.rumahaduan
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var admin: Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        admin = findViewById(R.id.Admin)
        admin.setOnClickListener {
            // Kode untuk perpindahan ke halaman atau aktivitas login
            val intent = Intent(this, AdminLog::class.java)
            startActivity(intent)
        }


    }


}