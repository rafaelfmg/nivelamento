package com.gloriadiaszup.dto

import com.gloriadiaszup.model.entities.Vehicle
import java.time.LocalDateTime

data class VehicleDto(

        val id: Long,
        val plate: String,
        val renavam: String,
        val idDriver: Long,
        val createdAt: LocalDateTime?,
        val updatedAt: LocalDateTime?
){
        constructor(vehicle: Vehicle): this(
                vehicle.id,
                vehicle.plate,
                vehicle.renavam,
                vehicle.idDriver,
                vehicle.createdAt,
                vehicle.updatedAt
        )
        fun toObject(vehicleDto: VehicleDto): Vehicle{
                return Vehicle(
                        vehicleDto.id,
                        vehicleDto.plate,
                        vehicleDto.renavam,
                        vehicleDto.idDriver,
                        vehicleDto.createdAt,
                        vehicleDto.updatedAt
                )
        }
}