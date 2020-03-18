package com.gloriadiaszup.model.dto.request

import com.gloriadiaszup.model.entities.Driver
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.Instant
import java.util.*
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull


data class DriverDto (

    @get: NotNull
    @get: NotEmpty
    val name: String,
    @get: NotNull
    @get: NotEmpty
    val cnhNumber: String,
    @get: NotNull
    @NotEmpty
    val dateOfBirth: String
){
    fun toDriver(): Driver {
        val formatter: DateFormat = SimpleDateFormat("dd-MM-yyyy")
        val date: Date = formatter.parse(dateOfBirth)
        return Driver(
                name = name,
                cnhNumber = cnhNumber,
                dateOfBirth = date,
                createdAt = Instant.now(),
                updatedAt = Instant.now()
        )
    }
}