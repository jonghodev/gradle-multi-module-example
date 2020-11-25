package com.crealstories.gateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CerealGatewayServerApplication

fun main(args: Array<String>) {
    runApplication<CerealGatewayServerApplication>(*args)
}
