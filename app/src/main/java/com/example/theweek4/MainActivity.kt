package com.example.theweek4
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.theweek4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//define a global variable that can be used to access the view element
// In java this would look like private ActivityMain binding;
private lateinit var binding : ActivityMainBinding
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    //initialize the binding variable
    binding = ActivityMainBinding.inflate(layoutInflater)
    //set the contentView to use the binding class instead of the XML
    //connecะ to the xml layout
    setContentView(binding.root)
    binding.passDetailsButton.setOnClickListener {
        var name = binding.nameEditText.text.toString()
        if (name.isNotEmpty()) {
            // pass the name to another activity
            var intent = Intent(this, PassDetailsActivity::class.java)
            intent.putExtra("name",name)
            startActivity(intent)
        } else
        {
            Toast.makeText(this,"Please Enter your name", Toast.LENGTH_LONG).show()
        }
    }
}



}
