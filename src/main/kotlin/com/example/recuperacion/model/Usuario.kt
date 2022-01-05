package com.example.recuperacion.model
import javax.persistence.*


@Entity
@Table(name = "usuario")
class Usuario {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var nombre: String? = null
    var comentarios: String? = null
    var crear: String? = null
}