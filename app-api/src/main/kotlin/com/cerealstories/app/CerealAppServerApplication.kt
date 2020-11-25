package com.cerealstories.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CerealAppServerApplication

fun main(args: Array<String>) {
    runApplication<CerealAppServerApplication>(*args)
}
