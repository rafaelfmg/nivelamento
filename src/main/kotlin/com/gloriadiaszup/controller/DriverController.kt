package com.gloriadiaszup.controller

import com.gloriadiaszup.api.DriverRequest
import com.gloriadiaszup.model.entities.Driver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import com.gloriadiaszup.service.DriverService
import org.springframework.web.bind.annotation.*
import java.text.SimpleDateFormat
import java.time.Instant
import java.util.*
import javax.validation.Valid

@RestController
@RequestMapping("/driver")
class DriverController @Autowired constructor(private val driverService: DriverService) {

    @GetMapping("/{id}")
    fun findDriverById(@PathVariable("id") id: Long): ResponseEntity<Optional<Driver>>{
        val driver = driverService.findById(id)
        return ResponseEntity.ok().body(driver)
    }

    @GetMapping
    fun findAll():ResponseEntity<List<Driver>>{
        return ResponseEntity.ok().body(driverService.findAll())
    }
    @PostMapping
    fun createDriver(@Valid @RequestBody driverRequest: DriverRequest): ResponseEntity<Driver>{
        val format = SimpleDateFormat("dd/MM/yyyy")
        val date = format.parse(driverRequest.dateOfBirth)
        val driver = driverService.create(
                Driver(name = driverRequest.name,
                        cnhNumber = driverRequest.cnhNumber,
                        dateOfBirth = date,
                        createdAt = Instant.now(),
                        updatedAt = Instant.now()
                )
        )
        return ResponseEntity.ok().body(driver)
    }

    @DeleteMapping("/{id}")
    fun deleteDriver(@PathVariable id: Long): ResponseEntity<Driver>{
        driverService.deleteById(id)
        return ResponseEntity.ok().build()
    }
    @PutMapping("/{id}")
    fun updateDriver(@PathVariable id: Long, @Valid @RequestBody driver: Driver): ResponseEntity<Driver>{
        return ResponseEntity.ok(driverService.update(driver))
    }
}