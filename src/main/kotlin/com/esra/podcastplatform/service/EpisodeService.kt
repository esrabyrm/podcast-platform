package com.esra.podcastplatform.service

import com.esra.podcastplatform.entity.Episode

interface EpisodeService {
    fun findAll(): List<Episode>
    fun findById(id: Long): Episode?
    fun save(episode: Episode): Episode
    fun deleteById(id: Long)
    fun findByTitleContaining(title: String): List<Episode>
    fun findByPodcasterId(podcasterId: Long): List<Episode>
}