package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class DemoApplication {
	@Bean
	fun createBean(): MyBean {
		println("Bean Created")
		println()
		return MyBean()
	}
}

class MyBean {
	
}

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}
