package com.gloriadiaszup.controller

import com.gloriadiaszup.api.ScheduleRequest
import com.gloriadiaszup.model.entities.Schedule
import com.gloriadiaszup.service.ScheduleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.time.Instant
import java.util.*
import javax.validation.Valid

@RestController
@RequestMapping("/schedule")
class ScheduleController(@Autowired private val scheduleService: ScheduleService) {

    @GetMapping
    fun findAll(): ResponseEntity<List<Schedule>>{
        return ResponseEntity.ok().body(scheduleService.findAll())
    }
    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): ResponseEntity<Optional<Schedule>> {
        return ResponseEntity.ok().body(scheduleService.findById(id))
    }
    @PostMapping
    fun create(@Valid @RequestBody scheduleRequest: ScheduleRequest): ResponseEntity<Schedule> {
        val schedule = Schedule(idDriver = scheduleRequest.idDriver,
                idProduct = scheduleRequest.idProduct,
                idVehicle = scheduleRequest.idVehicle,
                idTerminal = scheduleRequest.idTerminal,
                totalValue = scheduleRequest.totalValue,
                cargoWeight = scheduleRequest.cargoWeight,
                scheduledAt = scheduleRequest.scheduledAt,
                createdAt = Instant.now(),
                updatedAt = Instant.now()
        )
        return ResponseEntity.ok().body(scheduleService.create(schedule))
    }
    @PutMapping
    fun update(@Valid @RequestBody schedule: Schedule ): ResponseEntity<Schedule> {
        val scheduleUpdate = Schedule(
                schedule.id, schedule.idDriver, schedule.idVehicle, schedule.idProduct, schedule.idTerminal,
                schedule.cargoWeight, schedule.totalValue, schedule.scheduledAt, schedule.createdAt
        )
        return ResponseEntity.ok().body(scheduleService.update(schedule))
    }
    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<Unit> {
        return ResponseEntity.ok().body(scheduleService.deleteById(id))
    }

}