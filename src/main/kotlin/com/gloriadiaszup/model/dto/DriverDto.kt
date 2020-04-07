package com.gloriadiaszup.model.dto

import java.time.LocalDateTime

data class DriverDto (

        var id: Long? = null,
        var name: String? = null,
        var cnhNumber: String? = null,
        var dateOfBirth: String? = null,
        var updatedAt: LocalDateTime? = null,
        var createdAt: LocalDateTime? = null
)