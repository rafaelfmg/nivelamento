package com.gloriadiaszup.controller

import com.gloriadiaszup.model.dto.request.ScheduleDto
import com.gloriadiaszup.model.dto.response.ScheduleResponse
import com.gloriadiaszup.model.entities.Schedule
import com.gloriadiaszup.service.ScheduleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*
import javax.validation.Valid

@RestController
@RequestMapping("/schedule")
class ScheduleController(@Autowired private val scheduleService: ScheduleService) {

    @GetMapping
    fun findAll(): ResponseEntity<ArrayList<ScheduleResponse>>{
        return ResponseEntity.ok().body(ScheduleResponse().toDtoList(scheduleService.findAll()))
    }
    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): ResponseEntity<ScheduleResponse> {
        return ResponseEntity.ok().body(ScheduleResponse().toDto(scheduleService.findById(id).get()))
    }
    @PostMapping
    fun create(@Valid @RequestBody scheduleDto: ScheduleDto): ResponseEntity<ScheduleResponse> {
        val schedule = scheduleService.create(scheduleDto.toSchedule())
        return ResponseEntity.ok().body(ScheduleResponse().toDto(schedule))
    }
    @PutMapping
    fun update(@Valid @RequestBody schedule: Schedule ): ResponseEntity<ScheduleResponse> {
        return ResponseEntity.ok().body(ScheduleResponse().toDto(scheduleService.update(schedule)))
    }
    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<Unit> {
        return ResponseEntity.ok().body(scheduleService.deleteById(id))
    }

}