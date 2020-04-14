package com.gloriadiaszup.model.dto

import java.time.LocalDateTime

data class VehicleDto(

        var id: Long? = null,
        var plate: String? = null,
        var renavam: String? = null,
        var idDriver: Long? = null,
        var createdAt: LocalDateTime? = null,
        var updatedAt: LocalDateTime? = null
)