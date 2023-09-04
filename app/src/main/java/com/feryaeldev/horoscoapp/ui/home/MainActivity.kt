package com.feryaeldev.horoscoapp.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.feryaeldev.horoscoapp.R
import com.feryaeldev.horoscoapp.databinding.ActivityMainBinding
import com.feryaeldev.horoscoapp.ui.OnFragmentActionsListener

class MainActivity : AppCompatActivity(), OnFragmentActionsListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // ViewBinding
        setContentView(binding.root)

        binding.helloworld.text = getString(R.string.hello)
    }

    override fun onClickFragmentButton() {
        Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()
    }
}