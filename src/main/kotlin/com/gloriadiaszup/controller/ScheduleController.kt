package com.gloriadiaszup.controller

import com.gloriadiaszup.model.dto.ScheduleDto
import com.gloriadiaszup.model.dto.ScheduleListDto
import com.gloriadiaszup.service.ScheduleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/schedule")
class ScheduleController(@Autowired private val scheduleService: ScheduleService) {
/*
    @GetMapping
    fun findAll(): ScheduleListDto {
        return ScheduleListDto().get(scheduleService.findAll())
    }
    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): ScheduleDto {
        return ScheduleDto(scheduleService.findById(id).get())
    }
    @PostMapping
    fun create(@Valid @RequestBody scheduleDto: ScheduleDto): ScheduleDto {
        return ScheduleDto(scheduleService.create(scheduleDto.toObject()))
    }
    @PutMapping
    fun update(@Valid @RequestBody schedule: ScheduleDto): ScheduleDto {
        return ScheduleDto(scheduleService.update(schedule.toObject()))
    }
    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) {
        return scheduleService.deleteById(id)
    }

}*/
}