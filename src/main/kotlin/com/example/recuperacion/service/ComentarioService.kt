package com.example.recuperacion.service

import com.example.recuperacion.model.Comentario
import com.example.recuperacion.repository.ComentarioRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.lang.Exception

@Service
class ComentarioService {
    @Autowired
    lateinit var comentarioRepository: ComentarioRepository
    fun list(): List<Comentario> {
        return comentarioRepository.findAll()
    }
    fun save(comentario: Comentario): Comentario {
        return comentarioRepository.save(comentario)
    }
    fun update(comentario: Comentario):Comentario{
        return  comentarioRepository.save(comentario)
    }

    fun updateDescription (comentario: Comentario):Comentario {
        val response = comentarioRepository.findById(comentario.id)
                ?: throw Exception()
        response.apply {
            this.fechapublicacion=comentario.fechapublicacion
        }
        return comentarioRepository.save(response)
    }

    fun delete (id:Long): Boolean{
        comentarioRepository.deleteById(id)
        return true
    }
}