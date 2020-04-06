package com.gloriadiaszup.dto

import com.gloriadiaszup.model.entities.Driver
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.util.*


data class DriverDto (

        var id: Long,
        var name: String,
        var cnhNumber: String,
        var dateOfBirth: String,
        var updatedAt: LocalDateTime?,
        var createdAt: LocalDateTime?
){

    constructor(driver: Driver): this(
            id = driver.id,
            name = driver.name,
            cnhNumber = driver.cnhNumber,
            dateOfBirth = driver.dateOfBirth.toString(),
            createdAt = driver.createdAt,
            updatedAt = driver.updatedAt
    )

    fun toObject(): Driver {
        val formatter: DateFormat = SimpleDateFormat("dd-MM-yyyy")
        val date: Date = formatter.parse(dateOfBirth)
        return Driver(
                id = id,
                name = name,
                cnhNumber = cnhNumber,
                dateOfBirth = date,
                createdAt = createdAt,
                updatedAt = updatedAt
        )
    }
}

