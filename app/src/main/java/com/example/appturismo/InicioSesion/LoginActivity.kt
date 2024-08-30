package com.example.appturismo.InicioSesion

<<<<<<< HEAD
import android.content.Intent
import android.os.Bundle
import android.widget.Button
=======
import android.os.Bundle
>>>>>>> 0195629540eaebff226c97c4d495fee523883b9c
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.appturismo.R
<<<<<<< HEAD
import com.example.appturismo.menu.MenuInicioActivity
=======
>>>>>>> 0195629540eaebff226c97c4d495fee523883b9c

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

<<<<<<< HEAD
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            // Crear un Intent para ir de MainActivity a SecondActivity
            val intent = Intent(this, MenuInicioActivity::class.java)
            startActivity(intent)
        }

=======
>>>>>>> 0195629540eaebff226c97c4d495fee523883b9c

    }
}