package com.example.recuperacion.repository

import com.example.recuperacion.model.Post
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<Post, Long> {
    fun findById(id: Long?): Post?
}