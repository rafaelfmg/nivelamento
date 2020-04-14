package com.gloriadiaszup.model.entity.mappers

import com.gloriadiaszup.model.dto.VehicleDto
import com.gloriadiaszup.model.entity.Vehicle
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface VehicleMapper {

    fun toModel(vehicleDto: VehicleDto): Vehicle
    fun toDto(vehicle: Vehicle): VehicleDto
    fun toListDto(vehicles: List<Vehicle>): List<VehicleDto>
}