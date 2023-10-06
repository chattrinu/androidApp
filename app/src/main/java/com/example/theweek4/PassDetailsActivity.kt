package com.example.theweek4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.theweek4.databinding.ActivityMainBinding
import com.example.theweek4.databinding.ActivityPassDetailsBinding

class PassDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPassDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPassDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var name = intent.getStringExtra("name")
        binding.nameTextView.text=name

        //go back to the main by closing this activity
        binding.backToMainButton.setOnClickListener{
            //startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}