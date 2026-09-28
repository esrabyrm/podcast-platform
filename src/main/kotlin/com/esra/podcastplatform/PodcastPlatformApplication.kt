package com.esra.podcastplatform

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PodcastPlatformApplication

fun main(args: Array<String>) {
	runApplication<PodcastPlatformApplication>(*args)
}
