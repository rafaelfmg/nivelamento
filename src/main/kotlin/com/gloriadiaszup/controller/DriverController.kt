package com.gloriadiaszup.controller

import com.gloriadiaszup.model.dto.DriverDto
import com.gloriadiaszup.model.entity.mappers.DriverMapper
import org.springframework.beans.factory.annotation.Autowired
import com.gloriadiaszup.service.DriverService
import org.mapstruct.factory.Mappers
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/driver")
class DriverController @Autowired constructor(private val driverService: DriverService) {

    private val driverMapper = Mappers.getMapper(DriverMapper::class.java)

    @GetMapping("/{id}")
    fun findDriverById(@PathVariable("id") id: Long): DriverDto {
        return driverMapper.toDto(driverService.findById(id).get())
    }

    @GetMapping
    fun findAll(): List<DriverDto> {
       return driverMapper.toListDto(driverService.findAll())
    }
    @PostMapping
    fun createDriver(@Valid @RequestBody driverDto: DriverDto): DriverDto {
        return driverMapper.toDto(driverService.create(driverMapper.toModel(driverDto)))
    }

    @DeleteMapping("/{id}")
    fun deleteDriver(@PathVariable id: Long){
        return driverService.deleteById(id)
    }
    @PutMapping
    fun updateDriver(@Valid @RequestBody driverDto: DriverDto): DriverDto {
        return driverMapper.toDto(driverService.update(driverMapper.toModel(driverDto)))
    }
}