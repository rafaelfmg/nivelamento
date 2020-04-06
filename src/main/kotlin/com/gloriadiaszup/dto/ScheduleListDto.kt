package com.gloriadiaszup.dto

import com.gloriadiaszup.model.entities.Schedule
import java.util.ArrayList

class ScheduleListDto(
        val scheduleListDto: List<ScheduleDto> = ArrayList()
){

        fun get(schedules: List<Schedule>): ScheduleListDto{
            val listDto = ArrayList<ScheduleDto>()
            for (schedule in schedules){
                listDto.add(ScheduleDto(schedule))
            }
            return ScheduleListDto(listDto)
        }
}