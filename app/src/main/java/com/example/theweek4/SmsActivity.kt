package com.example.theweek4

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.theweek4.databinding.ActivitySmsBinding

class SmsActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySmsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySmsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.backToMainButton.setOnClickListener{
            finish()
        }
        binding.imageButton.setOnClickListener{
            var phoneNum = binding.editTextPhone.text.toString()
            var msg = binding.msgEditText.text.toString()
            if (phoneNum.isNotEmpty() && msg.isNotEmpty())
            {
                // send om SMS
                var uri = Uri.parse("smsto:$phoneNum")
                var intent = Intent(Intent.ACTION_SENDTO,uri)
                intent.putExtra("sms_body", msg)
                startActivity(intent)
            } else
            {
                Toast.makeText(this,"Enter a phone and message",Toast.LENGTH_LONG).show()
            }
        }
    }
}