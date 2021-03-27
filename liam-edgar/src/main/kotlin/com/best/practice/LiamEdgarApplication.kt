package com.best.practice

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LiamEdgarApplication

fun main(args: Array<String>) {
	runApplication<LiamEdgarApplication>(*args) {
		setBannerMode(Banner.Mode.OFF)
	}
}
