package com.example.recuperacion.model
import javax.persistence.*


@Entity
@Table(name = "post")
class Post {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var titulo: String? = null
    var autor: String? = null
    var fecha: String? = null
}