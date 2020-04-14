package com.gloriadiaszup.model.dto

import java.time.LocalDateTime
data class ScheduleDto(

        var id: Long? = null,
        var idDriver: Long? = null,
        var idVehicle: Long? = null,
        var idProduct: Long? = null,
        var idTerminal: Long? = null,
        var cargoWeight: Int? = null,
        var totalValue: Long? = null,
        var scheduledAt: LocalDateTime? = null,
        var createdAt: LocalDateTime? = null,
        var updatedAt: LocalDateTime? = null
)