package com.gloriadiaszup.controller

import com.gloriadiaszup.model.dto.request.DriverDto
import com.gloriadiaszup.model.dto.response.DriverResponse
import com.gloriadiaszup.model.entities.Driver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import com.gloriadiaszup.service.DriverService
import org.springframework.web.bind.annotation.*
import java.util.*
import javax.validation.Valid

@RestController
@RequestMapping("/driver")
class DriverController @Autowired constructor(private val driverService: DriverService) {

    @GetMapping("/{id}")
    fun findDriverById(@PathVariable("id") id: Long): ResponseEntity<DriverResponse> {
        val driver = driverService.findById(id)
        return ResponseEntity.ok().body(DriverResponse().toDto(driver.get()))
    }

    @GetMapping
    fun findAll(): ResponseEntity<ArrayList<DriverResponse>> {
        return ResponseEntity.ok().body(DriverResponse().toDtoList(driverService.findAll()))
    }
    @PostMapping
    fun createDriver(@Valid @RequestBody driverDto: DriverDto): ResponseEntity<DriverResponse> {
        val driver = driverService.create(driverDto.toDriver())
        return ResponseEntity.ok().body(DriverResponse().toDto(driver))
    }

    @DeleteMapping("/{id}")
    fun deleteDriver(@PathVariable id: Long):ResponseEntity<Unit>{
        return ResponseEntity.ok().body(driverService.deleteById(id))
    }
    @PutMapping("/{id}")
    fun updateDriver(@PathVariable id: Long, @Valid @RequestBody driver: Driver): ResponseEntity<DriverResponse>{
        return ResponseEntity.ok(DriverResponse().toDto(driverService.update(driver)))
    }
}