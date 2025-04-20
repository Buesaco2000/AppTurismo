package com.example.appturismo.Services
import com.example.appturismo.Models.LoginResponse
import com.example.appturismo.Models.UsuarioRegistro
import com.example.appturismo.Models.Usuarios
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiService {
    @POST("api/token/") // Ajusta según tu URL en Django
    fun loginUser(@Body usuarios: Usuarios): Call<LoginResponse>

    @POST("api/usuarios/") // Ajusta según tu URL en Django
    fun registerUser(@Body usuario: UsuarioRegistro): Call<LoginResponse>
}
