package com.gloriadiaszup.model.entity.mappers

import com.gloriadiaszup.model.dto.DriverDto
import com.gloriadiaszup.model.entity.Driver
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface DriverMapper {

    fun toDto(driver: Driver): DriverDto
    fun toModel(dto: DriverDto): Driver
}
