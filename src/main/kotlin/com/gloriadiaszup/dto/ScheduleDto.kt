package com.gloriadiaszup.dto

import com.gloriadiaszup.model.entities.Schedule
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
){
        constructor(schedule: Schedule): this(
                schedule.id,
                schedule.idDriver,
                schedule.idVehicle,
                schedule.idProduct,
                schedule.idTerminal,
                schedule.cargoWeight,
                schedule.totalValue,
                schedule.scheduledAt,
                schedule.createdAt,
                schedule.updatedAt
        )
        fun toObject(): Schedule {
                return  Schedule(
                        id,
                        idDriver,
                        idProduct,
                        idVehicle,
                        idTerminal,
                        cargoWeight,
                        totalValue,
                        scheduledAt,
                        createdAt,
                        updatedAt
                )
        }
}