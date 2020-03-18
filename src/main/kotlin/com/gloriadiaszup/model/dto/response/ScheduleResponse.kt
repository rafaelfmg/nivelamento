package com.gloriadiaszup.model.dto.response

import com.gloriadiaszup.model.entities.Schedule
import java.time.LocalDateTime

class ScheduleResponse(
        id: Long? = null,
        idDriver: Long? = null,
        idVehicle: Long? = null,
        idProduct: Long? = null,
        idTerminal: Long? = null,
        cargoWeight: Int? = null,
        totalValue: Long? = null,
        scheduledAt: LocalDateTime? = null
) {
    fun toDto(schedule: Schedule): ScheduleResponse{
        return ScheduleResponse(
                schedule.id,
                schedule.idDriver,
                schedule.idVehicle,
                schedule.idProduct,
                schedule.idTerminal,
                schedule.cargoWeight,
                schedule.totalValue,
                schedule.scheduledAt
        )
    }
    fun toDtoList(schedules: List<Schedule>): ArrayList<ScheduleResponse>{
        val schedulesResponse = ArrayList<ScheduleResponse>()
        for (schedule in schedules){
            schedulesResponse.add(ScheduleResponse().toDto(schedule))
        }
        return schedulesResponse
    }
}