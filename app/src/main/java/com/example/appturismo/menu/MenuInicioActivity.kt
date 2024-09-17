package com.example.appturismo.menu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.appturismo.menu.adapter.ListEventosViewAdapter
import com.example.appturismo.R
import com.example.appturismo.menu.OpcionesMenu.BuscarMenuActivity
import com.example.appturismo.menu.OpcionesMenu.LugaresMenuActivity
import com.example.appturismo.menu.OpcionesMenu.MapaMenuActivity
import com.example.appturismo.menu.OpcionesMenu.Perfil.PerfilMenuActivity
import com.example.appturismo.menu.Provider.ListEventosProvider
import com.example.appturismo.menu.Provider.ListLugaresProvider
import com.example.appturismo.menu.adapter.ListLugaresViewAdapter

class MenuInicioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu_inicio)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initRecyclerView()

        val btnPerfil = findViewById<LinearLayout>(R.id.btnPerfil)
        val btnLugares = findViewById<LinearLayout>(R.id.btnLugares)
        val btnBuscar = findViewById<LinearLayout>(R.id.btnBuscar)
        val btnMapa = findViewById<LinearLayout>(R.id.btnMapa)

        btnMapa.setOnClickListener {
            val intent = Intent(this, MapaMenuActivity::class.java)
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
    }

    private fun initRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerListView)
        val recyclerLugaresView = findViewById<RecyclerView>(R.id.recyclerListLugaresView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ListEventosViewAdapter(ListEventosProvider.eventosList)

        recyclerLugaresView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerLugaresView.adapter = ListLugaresViewAdapter(ListLugaresProvider.lugaresList)

    }
}