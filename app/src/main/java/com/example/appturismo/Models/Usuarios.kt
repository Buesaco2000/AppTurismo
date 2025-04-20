package com.example.appturismo.Models

data class Usuarios(
    val correo: String,
    val password: String
)

data class UsuarioRegistro(
    val nombre: String,
    val apellido: String,
    val correo: String,
    val password: String
)

