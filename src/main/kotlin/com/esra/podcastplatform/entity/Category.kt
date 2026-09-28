package com.esra.podcastplatform.entity

    import jakarta.persistence.*

    @Entity
    @Table(name = "categories")
    class Category(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,

        @Column(nullable = false, unique = true)
        var name: String = "",

        var description: String? = null,

        @OneToMany(mappedBy = "category", cascade = [CascadeType.ALL])
        var episodes: MutableList<Episode> = mutableListOf()
    )
