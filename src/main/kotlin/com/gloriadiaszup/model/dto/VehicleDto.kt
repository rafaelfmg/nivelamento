package com.gloriadiaszup.model.dto

import com.gloriadiaszup.model.entity.Vehicle
import java.time.LocalDateTime

data class VehicleDto(

        val id: Long,
        val plate: String,
        val renavam: String,
        val idDriver: Long,
        val createdAt: LocalDateTime?,
        val updatedAt: LocalDateTime?
)