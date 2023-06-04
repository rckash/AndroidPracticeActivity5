package com.example.androidpracticeexercise5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidpracticeexercise5.databinding.ActivityContactDetailsBinding
import com.example.androidpracticeexercise5.databinding.ActivityMainBinding

class ContactDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityContactDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val contactName = intent.getStringExtra("myName")
        binding.textViewNameDisplay.text = contactName
        val contactPhoneNumber = intent.getStringExtra("myPhoneNum")
        binding.textViewPhoneNumberDisplay.text = contactPhoneNumber
        val contactEmail = intent.getStringExtra("myEmail")
        binding.textViewEmailDisplay.text = contactEmail
        val contactAddress = intent.getStringExtra("myAddress")
        binding.textViewAddressDisplay.text = contactAddress
        val contactCity = intent.getStringExtra("myCity")
        binding.textViewCityDisplay.text = contactCity
        val contactZipCode = intent.getStringExtra("myZipCode")
        binding.textViewZipCodeDisplay.text = contactZipCode
        val contactCountry = intent.getStringExtra("myCountry")
        binding.textViewCountryDisplay.text = contactCountry
        val contactOrganization = intent.getStringExtra("myOrganization")
        binding.textViewOrganizationDisplay.text = contactOrganization
        val contactProfession = intent.getStringExtra("myProfession")
        binding.textViewProfessionDisplay.text = contactProfession
    }
}