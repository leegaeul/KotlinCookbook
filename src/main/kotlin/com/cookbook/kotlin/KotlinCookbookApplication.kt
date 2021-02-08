package com.cookbook.kotlin

import org.springframework.boot.runApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlinCookbookApplication

fun main(args: Array<String>) {
	runApplication<KotlinCookbookApplication>(*args)
	
}
