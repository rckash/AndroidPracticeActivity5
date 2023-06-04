package com.example.androidpracticeexercise5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidpracticeexercise5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSubmit.setOnClickListener {
            val myIntent = Intent(this, ContactDetailsActivity::class.java)
            val myName: String = binding.editTextContactName.text.toString()
            myIntent.putExtra("myName", myName)
            val myPhoneNum: String = binding.editTextPhoneNum.text.toString()
            myIntent.putExtra("myPhoneNum", myPhoneNum)
            val myEmail: String = binding.editTextEmail.text.toString()
            myIntent.putExtra("myEmail", myEmail)
            val myAddress: String = binding.editTextAddress.text.toString()
            myIntent.putExtra("myAddress", myAddress)
            val myCity: String = binding.editTextCity.text.toString()
            myIntent.putExtra("myCity", myCity)
            val myZipCode: String = binding.editTextZipCode.text.toString()
            myIntent.putExtra("myZipCode", myZipCode)
            val myCountry: String = binding.editTextCountry.text.toString()
            myIntent.putExtra("myCountry", myCountry)
            val myOrganization: String = binding.editTextOrganization.text.toString()
            myIntent.putExtra("myOrganization", myOrganization)
            val myProfession: String = binding.editTextProfession.text.toString()
            myIntent.putExtra("myProfession", myProfession)
            startActivity(myIntent)
            finish()
        }
    }
}