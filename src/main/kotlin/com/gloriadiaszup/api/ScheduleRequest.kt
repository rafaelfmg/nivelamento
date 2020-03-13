package com.gloriadiaszup.api

import java.time.LocalDateTime
import javax.validation.constraints.NotNull

data class ScheduleRequest(

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
)