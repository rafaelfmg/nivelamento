package com.gloriadiaszup.service

import com.gloriadiaszup.model.entity.Schedule
import com.gloriadiaszup.repository.ScheduleRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class ScheduleService(private val scheduleRepository: ScheduleRepository) {

    fun create(schedule: Schedule): Schedule {
        return scheduleRepository.save(schedule)
     }
    fun findById(id: Long): Optional<Schedule> {
        return scheduleRepository.findById(id)
    }
    fun findAll(): List<Schedule> {
        return scheduleRepository.findAll()
    }
    fun update(schedule: Schedule): Schedule {
        schedule.createdAt = scheduleRepository.findById(schedule.id).get().createdAt
        return scheduleRepository.save(schedule)
    }
    fun deleteById(id: Long){
        return scheduleRepository.deleteById(id)
    }
}