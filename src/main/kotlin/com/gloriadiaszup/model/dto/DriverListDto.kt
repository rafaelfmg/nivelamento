package com.gloriadiaszup.model.dto

import com.gloriadiaszup.model.entity.Driver
import java.util.ArrayList

data class DriverListDto(
        var driversDto: List<DriverDto>? = ArrayList()
){
   /* fun get(drivers: List<Driver>): DriverListDto {
        val listDto = ArrayList<DriverDto>()
        for (driver in drivers){
            listDto.add(DriverDto((driver)))
        }
        return DriverListDto(listDto)
    }*/
}