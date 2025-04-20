package com.example.appturismo.InicioSesion

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import retrofit2.Callback
import retrofit2.Call
import retrofit2.Response
import android.widget.Toast
import android.content.Context
import android.content.Intent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.appturismo.Models.LoginResponse
import com.example.appturismo.Models.UsuarioRegistro
import com.example.appturismo.R
import com.example.appturismo.Services.RetrofitClient


class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val name = findViewById<EditText>(R.id.name)
        val apellido = findViewById<EditText>(R.id.apellido)
        val email = findViewById<EditText>(R.id.email)
        val password = findViewById<EditText>(R.id.password)

        val btnAtras = findViewById<ImageView>(R.id.btnAtras)
        val button = findViewById<Button>(R.id.button)

        btnAtras.setOnClickListener {
            finish()
        }

        button.setOnClickListener {
            val nombreValue = name.text.toString()
            val apellidoValue = apellido.text.toString()
            val emailValue = email.text.toString()
            val passwordValue = password.text.toString()

            val request = UsuarioRegistro(nombreValue, apellidoValue, emailValue, passwordValue)

            RetrofitClient.api.registerUser(request).enqueue(object : Callback<LoginResponse>{
                override  fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>){
                    if (response.isSuccessful){
                        val token = response.body()?.access
                        val sharedPref = getSharedPreferences("tokens", Context.MODE_PRIVATE)
                        with(sharedPref.edit()){
                            putString("token", token)
                            apply()
                        }
                        Toast.makeText(this@RegisterActivity, "Registro Existoso", Toast.LENGTH_SHORT).show()
                        // ✅ Navegar a la pantalla principal
                        startActivity(Intent(this@RegisterActivity, LoginActivity::class.java))
                        finish()

                        }else {
                            Toast.makeText(this@RegisterActivity, "Error en el registro", Toast.LENGTH_SHORT).show()
                    }
                }

                override fun onFailure(call: Call<LoginResponse>, t: Throwable){
                    Toast.makeText(this@RegisterActivity, "Error en el registro", Toast.LENGTH_SHORT).show()
                }
            })
        }


    }

}