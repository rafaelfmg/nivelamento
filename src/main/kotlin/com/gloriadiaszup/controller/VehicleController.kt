package com.gloriadiaszup.controller

import com.gloriadiaszup.api.VehicleRequest
import com.gloriadiaszup.model.entities.Vehicle
import com.gloriadiaszup.repository.VehicleRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import com.gloriadiaszup.service.VehicleService
import org.springframework.web.bind.annotation.*
import java.util.*
import javax.validation.Valid

@RestController
@RequestMapping("/vehicle")
class VehicleController (@Autowired private val vehicleService: VehicleService, @Autowired
private val vehicleRepository: VehicleRepository){

    @GetMapping("{id}")
    fun getVehicle(@PathVariable("id") id: Long): ResponseEntity<Optional<Vehicle?>> {
        val vehicle = vehicleService.findById(id)
        return ResponseEntity.ok().body(vehicle)
    }

    @GetMapping
    fun findAll():ResponseEntity<ArrayList<Vehicle>>{
        return ResponseEntity.ok().body(vehicleService.findAll())
    }
    @PostMapping
    fun createVehicle(@Valid @RequestBody vehicleRequest: VehicleRequest): ResponseEntity<Vehicle>{
        val vehicle = vehicleService.create(
                Vehicle(plate = vehicleRequest.plate,
                        renavam = vehicleRequest.renavam,
                        idDriver = vehicleRequest.idDriver
                )
        )
        return ResponseEntity.ok().body(vehicle)
    }

    @DeleteMapping("/{id}")
    fun deleteVehicle(@PathVariable id: Long): ResponseEntity<Vehicle>{
        vehicleService.deleteById(id)
        return ResponseEntity.ok().build()
    }
    @PutMapping("/{id}")
    fun updateDriver(@PathVariable id: Long, @Valid @RequestBody vehicle: Vehicle): ResponseEntity<Vehicle>{
        return ResponseEntity.ok(vehicleService.update(vehicle))
    }
    @GetMapping("driver/{idDriver}")
    fun findByIdDriver(@PathVariable idDriver: Long): List<Vehicle>{
        return vehicleRepository.findByIdDriver(idDriver)
    }
}