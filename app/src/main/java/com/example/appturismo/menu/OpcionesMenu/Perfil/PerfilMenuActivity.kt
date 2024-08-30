package com.example.appturismo.menu.OpcionesMenu.Perfil

import android.content.Intent
import android.os.Bundle
import android.widget.FrameLayout
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

class PerfilMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_perfil_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnHistorial = findViewById<FrameLayout>(R.id.btnHistorial)
        val btnAccesibilidad = findViewById<FrameLayout>(R.id.btnAccesibilidad)
        val btnSeguridad = findViewById<FrameLayout>(R.id.btnSeguridad)
        val btnConfiguracion = findViewById<FrameLayout>(R.id.btnConfiguracion)
        val btnAyuda = findViewById<FrameLayout>(R.id.btnAyuda)
        val btnPerfil = findViewById<LinearLayout>(R.id.btnPerfil)
        val btnLugares = findViewById<LinearLayout>(R.id.btnLugares)
        val btnBuscar = findViewById<LinearLayout>(R.id.btnBuscar)
        val btnInicio = findViewById<FrameLayout>(R.id.btnInicio)
        val btnMapa = findViewById<LinearLayout>(R.id.btnMapa)

        btnMapa.setOnClickListener {
            val intent = Intent(this, MapaMenuActivity::class.java)
            startActivity(intent)
        }

        btnHistorial.setOnClickListener {
            val intent = Intent(this, HistorialActivity::class.java)
            startActivity(intent)
        }

        btnAccesibilidad.setOnClickListener {
            val intent = Intent(this, AccesibilidadActivity::class.java)
            startActivity(intent)
        }

        btnSeguridad.setOnClickListener {
            val intent = Intent(this, SeguridadProteccionActivity::class.java)
            startActivity(intent)
        }

        btnConfiguracion.setOnClickListener {
            val intent = Intent(this, ConfiguracionActivity::class.java)
            startActivity(intent)
        }

        btnAyuda.setOnClickListener {
            val intent = Intent(this, AyudaActivity::class.java)
            startActivity(intent)
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