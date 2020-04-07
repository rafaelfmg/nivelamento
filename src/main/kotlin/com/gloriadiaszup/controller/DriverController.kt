package com.gloriadiaszup.controller

import com.gloriadiaszup.model.dto.DriverDto
import com.gloriadiaszup.model.dto.DriverListDto
import com.gloriadiaszup.model.entity.Driver
import com.gloriadiaszup.model.entity.mappers.DriverMapper
import org.springframework.beans.factory.annotation.Autowired
import com.gloriadiaszup.service.DriverService
import org.mapstruct.factory.Mappers
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/driver")
class DriverController @Autowired constructor(private val driverService: DriverService) {
    /*
    @GetMapping("/{id}")
    fun findDriverById(@PathVariable("id") id: Long): DriverDto {
        return DriverDto((driverService.findById(id).get()))
    }

    @GetMapping
    fun findAll(): DriverListDto {
        return DriverListDto().get(driverService.findAll())
    }
    @PostMapping
    fun createDriver(@Valid @RequestBody driverDto: DriverDto): DriverDto {
        return DriverDto(driverService.create(driverDto.toObject()))
    }

    @DeleteMapping("/{id}")
    fun deleteDriver(@PathVariable id: Long){
        return driverService.deleteById(id)
    }
    @PutMapping
    fun updateDriver(@Valid @RequestBody driver: DriverDto): DriverDto {
        return DriverDto(driverService.update(driver.toObject()))
    }
*/
    @PostMapping("/test")
    fun test(@Valid @RequestBody driverDto: DriverDto): Driver{
        val convert = Mappers.getMapper(DriverMapper::class.java)
        return convert.toModel(driverDto)
    }
}