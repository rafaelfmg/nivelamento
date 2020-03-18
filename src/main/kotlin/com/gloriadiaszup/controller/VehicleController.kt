package com.gloriadiaszup.controller

import com.gloriadiaszup.model.dto.request.VehicleDto
import com.gloriadiaszup.model.dto.response.VehicleResponse
import com.gloriadiaszup.model.entities.Vehicle
import com.gloriadiaszup.repository.VehicleRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import com.gloriadiaszup.service.VehicleService
import org.springframework.web.bind.annotation.*
import javax.validation.Valid
import kotlin.collections.ArrayList

@RestController
@RequestMapping("/vehicle")
class VehicleController (@Autowired private val vehicleService: VehicleService, @Autowired
private val vehicleRepository: VehicleRepository){

    @GetMapping("{id}")
    fun getVehicle(@PathVariable("id") id: Long): ResponseEntity<VehicleResponse> {
        return ResponseEntity.ok().body(VehicleResponse().toDto(vehicleService.findById(id).get()))
    }

    @GetMapping
    fun findAll(): ResponseEntity<ArrayList<VehicleResponse>> {
        return ResponseEntity.ok().body(VehicleResponse().toDtoList(vehicleService.findAll()))
    }
    @PostMapping
    fun createVehicle(@Valid @RequestBody vehicleDto: VehicleDto): ResponseEntity<VehicleResponse>{
        val vehicle = vehicleService.create(vehicleDto.toVehicle())
        return ResponseEntity.ok().body(VehicleResponse().toDto(vehicle))
    }

    @DeleteMapping("/{id}")
    fun deleteVehicle(@PathVariable id: Long): ResponseEntity<Unit>{
        return ResponseEntity.ok().body(vehicleService.deleteById(id))
    }
    @PutMapping
    fun updateDriver(@Valid @RequestBody vehicle: Vehicle): ResponseEntity<VehicleResponse> {
        return ResponseEntity.ok().body(VehicleResponse().toDto(vehicleService.update(vehicle)))
    }
    @GetMapping("driver/{idDriver}")
    fun findByIdDriver(@PathVariable idDriver: Long): ResponseEntity<ArrayList<VehicleResponse>> {
        return ResponseEntity.ok().body(VehicleResponse().toDtoList(vehicleRepository.findByIdDriver(idDriver)))
    }
}