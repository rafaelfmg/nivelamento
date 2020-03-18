package com.gloriadiaszup.model.dto.request

import com.gloriadiaszup.model.entities.Vehicle
import java.time.Instant
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class VehicleDto(
        @get: NotNull
        @get: NotEmpty
        var plate: String?,
        @get: NotNull
        @get: NotEmpty
        var renavam: String?,
        @get: NotNull
        var idDriver: Long?
){

        fun toVehicle(): Vehicle{
                return Vehicle(
                        plate = plate,
                        renavam = renavam,
                        idDriver = idDriver,
                        createdAt = Instant.now(),
                        updatedAt = Instant.now()
                )
        }
}