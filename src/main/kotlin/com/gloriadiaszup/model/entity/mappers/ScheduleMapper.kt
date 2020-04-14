package com.gloriadiaszup.model.entity.mappers

import com.gloriadiaszup.model.dto.ScheduleDto
import com.gloriadiaszup.model.entity.Schedule
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface ScheduleMapper {

    fun toModel(scheduleDto: ScheduleDto):Schedule
    fun toDto(schedule: Schedule): ScheduleDto
    fun toListDto(schedules: List<Schedule>): List<ScheduleDto>
}