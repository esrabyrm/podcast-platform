package com.esra.podcastplatform.entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "episodes")
class Episode(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(nullable = false)
    var title: String = "",

    @Column(name = "release_date")
    var releaseDate: LocalDate? = null,

    @Column(name = "duration_minutes")
    var durationMinutes: Int? = null,

    @ManyToOne
    @JoinColumn(name = "podcaster_id")
    var podcaster: Podcaster? = null,

    @ManyToOne
    @JoinColumn(name = "category_id")
    var category: Category? = null
)