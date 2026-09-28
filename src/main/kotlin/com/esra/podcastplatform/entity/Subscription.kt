package com.esra.podcastplatform.entity

import jakarta.persistence.*
import java.time.LocalDateTime

enum class SubscriptionStatus { ACTIVE, CANCELLED, EXPIRED }

@Entity
@Table(name = "subscriptions")
class Subscription(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @ManyToOne
    @JoinColumn(name = "episode_id", nullable = false)
    var episode: Episode? = null,

    @ManyToOne
    @JoinColumn(name = "listener_id", nullable = false)
    var listener: Listener? = null,

    @Column(name = "subscribed_at", nullable = false)
    var subscribedAt: LocalDateTime? = null,

    @Enumerated(EnumType.STRING)
    var status: SubscriptionStatus = SubscriptionStatus.ACTIVE
)