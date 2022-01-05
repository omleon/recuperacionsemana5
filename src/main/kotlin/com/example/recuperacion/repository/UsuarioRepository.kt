package com.example.recuperacion.repository

import com.example.recuperacion.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository

interface UsuarioRepository : JpaRepository<Usuario, Long> {
    fun findById(id: Long?): Usuario?

}