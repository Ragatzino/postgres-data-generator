package dev.postgresdatagenerator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PostgresDataGeneratorApplication

fun main(args: Array<String>) {
	runApplication<PostgresDataGeneratorApplication>(*args)
}
