package com.gloriadiaszup.controller

import com.gloriadiaszup.dto.VehicleDto
import com.gloriadiaszup.dto.VehicleListDto
import com.gloriadiaszup.model.entities.Vehicle
import com.gloriadiaszup.repository.VehicleRepository
import org.springframework.beans.factory.annotation.Autowired
import com.gloriadiaszup.service.VehicleService
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/vehicle")
class VehicleController (@Autowired private val vehicleService: VehicleService, @Autowired
private val vehicleRepository: VehicleRepository){

    @GetMapping("{id}")
    fun getVehicle(@PathVariable("id") id: Long): VehicleDto {
        return VehicleDto((vehicleService.findById(id).get()))
    }

    @GetMapping
    fun findAll(): VehicleListDto {
        return VehicleListDto().get(vehicleService.findAll())
    }
    @PostMapping
    fun createVehicle(@Valid @RequestBody vehicleDto: VehicleDto): VehicleDto{
        return VehicleDto(vehicleService.create(vehicleDto.toObject(vehicleDto)))
    }

    @DeleteMapping("/{id}")
    fun deleteVehicle(@PathVariable id: Long){
        vehicleService.deleteById(id)
    }
    @PutMapping
    fun updateDriver(@Valid @RequestBody vehicle: Vehicle): VehicleDto {
        return VehicleDto((vehicleService.update(vehicle)))
    }
    @GetMapping("driver/{idDriver}")
    fun findByIdDriver(@PathVariable idDriver: Long): VehicleListDto {
        return VehicleListDto().get(vehicleRepository.findByIdDriver(idDriver))
    }
}