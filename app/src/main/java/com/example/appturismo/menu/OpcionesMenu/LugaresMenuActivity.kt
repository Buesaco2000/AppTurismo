package com.example.appturismo.menu.OpcionesMenu

import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.appturismo.R
import com.example.appturismo.menu.Provider.ListExperienciaLugaresProvider
import com.example.appturismo.menu.Provider.ListLugaresMenuViewProvider
import com.example.appturismo.menu.Provider.ListLugaresProvider
import com.example.appturismo.menu.adapter.ListExperienciaLugaresAdapter
import com.example.appturismo.menu.adapter.ListLugaresMenuViewAdapter
import com.example.appturismo.menu.adapter.ListLugaresViewAdapter

class LugaresMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lugares_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initRecyclerView()

        val btnAtras = findViewById<ImageButton>(R.id.btnAtrasLugares)

        btnAtras.setOnClickListener {
            finish()
        }
    }

    private fun initRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerListViewLugaresMenu)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter =
            ListLugaresMenuViewAdapter(ListLugaresMenuViewProvider.lugaresMenuList)
    }
}