package com.gloriadiaszup.model.dto.request

import com.gloriadiaszup.model.entities.Schedule
import java.time.Instant
import java.time.LocalDateTime
import javax.validation.constraints.NotNull

data class ScheduleDto(

        @NotNull
        val idDriver: Long,
        @NotNull
        val idVehicle: Long,
        @NotNull
        val idProduct: Long,
        @NotNull
        val idTerminal: Long,
        @NotNull
        val cargoWeight: Int,
        @NotNull
        val totalValue: Long,
        @NotNull
        val scheduledAt: LocalDateTime
){
        fun toSchedule(): Schedule {
                return  Schedule(
                        idDriver = idDriver,
                        idProduct = idProduct,
                        idVehicle = idVehicle,
                        idTerminal = idTerminal,
                        totalValue = totalValue,
                        cargoWeight = cargoWeight,
                        scheduledAt = scheduledAt,
                        createdAt = Instant.now(),
                        updatedAt = Instant.now()
                )
        }
}