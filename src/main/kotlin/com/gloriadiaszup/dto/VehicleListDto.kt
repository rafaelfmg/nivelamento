package com.gloriadiaszup.dto

import com.gloriadiaszup.model.entities.Vehicle
import java.util.ArrayList

class VehicleListDto(
        val vehicleListDto: List<VehicleDto> = ArrayList()
) {

    fun get(vehicles: List<Vehicle>): VehicleListDto {
        val listDto = ArrayList<VehicleDto>()
        for (vehicle in vehicles) {
            listDto.add(VehicleDto(vehicle))
        }
        return VehicleListDto(listDto)
    }
}