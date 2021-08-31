@file:Suppress("UseExpressionBody")

package com.example.apiassessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding = ActivityMainBinding.inflate(layoutInflater)
        clickRegistration()

    }
fun clickRegistration() {
    binding.etButtonLBI.setOnClickListener {

        var etnum1 = binding.etnum1.toString()
        var etnum2 = binding.etnum2.toString()
        var btnaddition = binding.btnaddition.toString()
        var btnsubtraction= binding.btnsubtraction.toString()
        var btnmultiplication = binding.btnmultiplication.toString()
        var btndivision = binding.btndivision.toString()
        var btnenter = binding.btnenter.toString()

        var Request = btnenter(
            etnum1= etnum1,
            etnum2 = etnum2,

        )}}}




