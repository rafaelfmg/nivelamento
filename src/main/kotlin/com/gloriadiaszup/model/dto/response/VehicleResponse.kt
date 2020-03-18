package com.gloriadiaszup.model.dto.response

import com.gloriadiaszup.model.entities.Vehicle

class VehicleResponse(
        val id: Long? = null,
        val plate: String? = null,
        val renavam: String? = null,
        val idDriver: Long? = null
) {
    fun toDto(vehicle: Vehicle): VehicleResponse{
        return VehicleResponse(
                vehicle.id,
                vehicle.plate,
                vehicle.renavam,
                vehicle.idDriver
        )
    }
    fun toDtoList(vehicles: List<Vehicle>): ArrayList<VehicleResponse>{
        val vehiclesResponse = java.util.ArrayList<VehicleResponse>()
        for (vehicle in vehicles){
            vehiclesResponse.add(VehicleResponse().toDto(vehicle))
        }
        return vehiclesResponse
    }
}