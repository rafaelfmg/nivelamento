package com.gloriadiaszup

import org.springframework.boot.runApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import java.time.Instant

@SpringBootApplication
open class Application

    fun main(args: Array<String>) {
        runApplication<Application>(*args)
    }