package com.kotlinspring.KotlinWithSpringboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinWithSpringbootApplication

fun main(args: Array<String>) {
	runApplication<KotlinWithSpringbootApplication>(*args)
}
