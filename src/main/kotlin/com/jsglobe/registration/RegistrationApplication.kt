package com.jsglobe.registration

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories
@ComponentScan
class RegistrationApplication

fun main(args: Array<String>) {
	runApplication<RegistrationApplication>(*args)
}
