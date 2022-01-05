package com.example.recuperacion.service

import com.example.recuperacion.model.Post
import com.example.recuperacion.repository.PostRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.lang.Exception

@Service
class PostService {
    @Autowired
    lateinit var postRepository: PostRepository
    fun list(): List<Post> {
        return postRepository.findAll()
    }
    fun save(post: Post): Post {
        return postRepository.save(post)
    }
    fun update(post: Post):Post{
        return  postRepository.save(post)
    }

    fun updateDescription (post: Post):Post {
        val response = postRepository.findById(post.id)
                ?: throw Exception()
        response.apply {
            this.titulo=post.titulo
        }
        return postRepository.save(response)
    }

    fun delete (id:Long): Boolean{
        postRepository.deleteById(id)
        return true
    }
}