package com.gloriadiaszup.model.dto.response

import com.gloriadiaszup.model.entities.Driver
import java.util.*

class DriverResponse(
        id: Long? = null,
        name: String? = null,
        cnhNumber: String? = null,
        dateOfBirth: Date? = null
) {
    fun toDto(driver: Driver): DriverResponse{
        return DriverResponse(
                driver.id,
                driver.name,
                driver.cnhNumber,
                driver.dateOfBirth
        )
    }
    fun toDtoList(drivers: List<Driver>): ArrayList<DriverResponse>{
        val driversResponse = ArrayList<DriverResponse>()
        for (driver in drivers){
            driversResponse.add(DriverResponse().toDto(driver))
        }
        return driversResponse
    }
}