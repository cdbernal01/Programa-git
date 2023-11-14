package com.example.logintesths

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.logintesths.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var username : EditText
    lateinit var password: EditText
    lateinit var loginButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.loginButton.setOnClickListener(View.OnClickListener {
            if (binding.username.text.toString() == "prueba" && binding.password.text.toString() == "12345678"){
                Toast.makeText(this, "Login Correctc!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Usuario o Contraseña Erronea!", Toast.LENGTH_SHORT).show()
            }
        })
    }
}