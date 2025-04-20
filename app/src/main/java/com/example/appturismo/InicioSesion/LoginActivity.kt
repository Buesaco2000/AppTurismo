package com.example.appturismo.InicioSesion


import android.content.Intent
import android.os.Bundle
import  android.util.Log
import android.widget.Button
import android.widget.EditText
import  android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.appturismo.Models.LoginResponse
import com.example.appturismo.Models.Usuarios
import com.example.appturismo.R
import com.example.appturismo.Services.RetrofitClient
import com.example.appturismo.menu.MenuInicioActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val emailEditText = findViewById<EditText>(R.id.email)
        val password = findViewById<EditText>(R.id.password)
        val loginButton = findViewById<Button>(R.id.button)

        loginButton.setOnClickListener{
            val correo = emailEditText.text.toString()
            val password = password.text.toString()

            if (correo.isNotEmpty() || password.isNotEmpty()){
                val usuarios = Usuarios(correo, password)

                RetrofitClient.api.loginUser(usuarios).enqueue(object : Callback<LoginResponse> {
                    override  fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>){
                        if (response.isSuccessful){
                            val tokens = response.body()

                            //Guardar Tokens
                            val sharedPref = getSharedPreferences("tokens", MODE_PRIVATE)
                            sharedPref.edit().putString("jwt_token", tokens?.access).apply()

                            Toast.makeText(this@LoginActivity, "Bienvenido ${tokens?.access}", Toast.LENGTH_SHORT).show()

                            startActivity(Intent(this@LoginActivity, MenuInicioActivity::class.java))
                            finish()
                        } else {
                            Log.e("LoginError", "Código: ${response.code()}, Body: ${response.errorBody()?.string()}")
                            Toast.makeText(this@LoginActivity, "Error al iniciar sesión", Toast.LENGTH_SHORT).show()

                        }

                    }

                    override  fun onFailure(call: Call<LoginResponse>, t: Throwable){
                        Toast.makeText(this@LoginActivity, "Error al iniciar sesión", Toast.LENGTH_SHORT).show()
                        Log.e("LoginActivity", "Error al iniciar sesión", t)

                    }

                })
            } else {
                Toast.makeText(this@LoginActivity, "Por favor ingrese su correo y contraseña", Toast.LENGTH_SHORT).show()

            }
        }

    }
}