package com.esra.podcastplatform.service

import com.esra.podcastplatform.entity.Listener

interface ListenerService {
    fun findAll(): List<Listener>
    fun findById(id: Long): Listener?
    fun save(listener: Listener): Listener
    fun deleteById(id: Long)
    fun findByEmail(email: String): Listener?
}