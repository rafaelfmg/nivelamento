package com.gloriadiaszup.controller

import com.gloriadiaszup.model.dto.ScheduleDto
import com.gloriadiaszup.model.entity.mappers.ScheduleMapper
import com.gloriadiaszup.service.ScheduleService
import org.mapstruct.factory.Mappers
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/schedule")
class ScheduleController(@Autowired private val scheduleService: ScheduleService) {

    private val scheduleMapper = Mappers.getMapper(ScheduleMapper::class.java)

    @GetMapping
    fun findAll(): List<ScheduleDto> {
     return scheduleMapper.toListDto(scheduleService.findAll())
    }
    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): ScheduleDto {
        return scheduleMapper.toDto(scheduleService.findById(id).get())
    }
    @PostMapping
    fun create(@Valid @RequestBody scheduleDto: ScheduleDto): ScheduleDto {
        return scheduleMapper.toDto(scheduleService.create(scheduleMapper.toModel(scheduleDto)))
    }
    @PutMapping
    fun update(@Valid @RequestBody scheduleDto: ScheduleDto): ScheduleDto {
        return scheduleMapper.toDto(scheduleService.update(scheduleMapper.toModel(scheduleDto)))
    }
    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) {
        return scheduleService.deleteById(id)
    }

}