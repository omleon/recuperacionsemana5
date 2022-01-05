package com.example.recuperacion.repository

import com.example.recuperacion.model.Comentario
import org.springframework.data.jpa.repository.JpaRepository

interface ComentarioRepository : JpaRepository<Comentario, Long> {
    fun findById(id: Long?): Comentario?

}