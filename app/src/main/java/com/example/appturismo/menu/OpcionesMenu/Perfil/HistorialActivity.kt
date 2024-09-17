package com.example.appturismo.menu.OpcionesMenu.Perfil

import android.content.Intent
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.appturismo.R
import com.example.appturismo.menu.MenuInicioActivity
import com.example.appturismo.menu.OpcionesMenu.BuscarMenuActivity
import com.example.appturismo.menu.OpcionesMenu.LugaresMenuActivity
import com.example.appturismo.menu.OpcionesMenu.MapaMenuActivity

class HistorialActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_historial)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnAtras = findViewById<ImageButton>(R.id.btnAtrasHistorial)
        val btnPerfil = findViewById<LinearLayout>(R.id.btnPerfil)
        val btnLugares = findViewById<LinearLayout>(R.id.btnLugares)
        val btnBuscar = findViewById<LinearLayout>(R.id.btnBuscar)
        val btnInicio = findViewById<FrameLayout>(R.id.btnInicio)
        val btnMapa = findViewById<LinearLayout>(R.id.btnMapa)

        btnMapa.setOnClickListener {
            val intent = Intent(this, MapaMenuActivity::class.java)
            startActivity(intent)
        }

        btnAtras.setOnClickListener {
            finish()
        }

        btnPerfil.setOnClickListener {
            val intent = Intent(this, PerfilMenuActivity::class.java)
            startActivity(intent)
        }

        btnLugares.setOnClickListener {
            val intent = Intent(this, LugaresMenuActivity::class.java)
            startActivity(intent)
        }

        btnBuscar.setOnClickListener {
            val intent = Intent(this, BuscarMenuActivity::class.java)
            startActivity(intent)
        }

        btnInicio.setOnClickListener {
            val intent = Intent(this, MenuInicioActivity::class.java)
            startActivity(intent)
        }
    }
}