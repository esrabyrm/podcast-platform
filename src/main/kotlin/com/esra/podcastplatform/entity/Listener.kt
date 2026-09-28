package com.esra.podcastplatform.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "listeners")
class Listener(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(nullable = false, unique = true)
    var email: String = "",

    @Column(nullable = false)
    var password: String = "",

    @Column(name = "first_name", nullable = false)
    var firstName: String = "",

    @Column(name = "last_name", nullable = false)
    var lastName: String = "",

    @Column(name = "created_at")
    var createdAt: LocalDateTime? = null,

    @OneToMany(mappedBy = "listener", cascade = [CascadeType.ALL])
    var subscriptions: MutableList<Subscription> = mutableListOf()
)