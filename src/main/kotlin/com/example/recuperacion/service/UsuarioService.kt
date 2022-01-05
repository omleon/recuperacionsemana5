package com.example.recuperacion.service

import com.example.recuperacion.model.Usuario
import com.example.recuperacion.repository.UsuarioRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.lang.Exception

@Service
class
UsuarioService {
    @Autowired
    lateinit var usuarioRepository: UsuarioRepository
    fun list(): List<Usuario> {
        return usuarioRepository.findAll()
    }
    fun save(usuario: Usuario): Usuario {
        return usuarioRepository.save(usuario)
    }
    fun update(usuario: Usuario):Usuario{
        return  usuarioRepository.save(usuario)
    }

    fun updateDescription (usuario: Usuario):Usuario {
        val response = usuarioRepository.findById(usuario.id)
                ?: throw Exception()
        response.apply {
            this.nombre=usuario.nombre
        }
        return usuarioRepository.save(usuario)
    }

fun delete (id:Long): Boolean{
    usuarioRepository.deleteById(id)
    return true
    }
}