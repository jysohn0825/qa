package com.konai.qa

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class QaTempApplication

fun main(args: Array<String>) {
    runApplication<QaTempApplication>(*args)
}
