package com.esra.podcastplatform.entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "podcasters")
class Podcaster(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(nullable = false)
    var displayName: String = "",

    @Column(name = "bio")
    var biography: String? = null,

    @Column(name = "started_at")
    var startedAt: LocalDate? = null,

    @OneToMany(mappedBy = "podcaster", cascade = [CascadeType.ALL])
    var episodes: MutableList<Episode> = mutableListOf()
)