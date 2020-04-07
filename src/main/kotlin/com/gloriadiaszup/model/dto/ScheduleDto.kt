package com.gloriadiaszup.model.dto

import com.gloriadiaszup.model.entity.Schedule
import java.time.LocalDateTime
data class ScheduleDto(

        val id: Long,
        val idDriver: Long,
        val idVehicle: Long,
        val idProduct: Long,
        val idTerminal: Long,
        val cargoWeight: Int,
        val totalValue: Long,
        val scheduledAt: LocalDateTime?,
        val createdAt: LocalDateTime?,
        val updatedAt: LocalDateTime?
)