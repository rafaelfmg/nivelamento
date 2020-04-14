package com.gloriadiaszup.controller

import com.gloriadiaszup.model.dto.VehicleDto
import com.gloriadiaszup.model.entity.mappers.VehicleMapper
import com.gloriadiaszup.repository.VehicleRepository
import org.springframework.beans.factory.annotation.Autowired
import com.gloriadiaszup.service.VehicleService
import org.mapstruct.factory.Mappers
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/vehicle")
class VehicleController (@Autowired private val vehicleService: VehicleService,
                         @Autowired private val vehicleRepository: VehicleRepository){

    private val vehicleMapper = Mappers.getMapper(VehicleMapper::class.java)

    @GetMapping("{id}")
    fun getVehicle(@PathVariable("id") id: Long): VehicleDto {
        return vehicleMapper.toDto(vehicleService.findById(id).get())
    }

    @GetMapping
    fun findAll(): List<VehicleDto> {
        return vehicleMapper.toListDto(vehicleService.findAll())
    }
    @PostMapping
    fun createVehicle(@Valid @RequestBody vehicleDto: VehicleDto): VehicleDto {
        return vehicleMapper.toDto(vehicleService.create(vehicleMapper.toModel(vehicleDto)))
    }

    @DeleteMapping("/{id}")
    fun deleteVehicle(@PathVariable id: Long){
        vehicleService.deleteById(id)
    }
    @PutMapping
    fun updateDriver(@Valid @RequestBody vehicleDto: VehicleDto): VehicleDto {
        return vehicleMapper.toDto(vehicleService.update(vehicleMapper.toModel(vehicleDto)))
    }
    @GetMapping("driver/{idDriver}")
    fun findByIdDriver(@PathVariable idDriver: Long): List<VehicleDto> {
       return vehicleMapper.toListDto(vehicleRepository.findByIdDriver(idDriver))
    }
}