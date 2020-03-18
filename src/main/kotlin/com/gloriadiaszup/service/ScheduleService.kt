package com.gloriadiaszup.service

import com.gloriadiaszup.model.entities.Schedule
import com.gloriadiaszup.repository.ScheduleRepository
import org.springframework.stereotype.Service
import java.time.Instant
import java.util.*

@Service
class ScheduleService(private val scheduleRepository: ScheduleRepository) {

    fun create(schedule: Schedule): Schedule{
        return scheduleRepository.save(schedule)
     }
    fun findById(id: Long): Optional<Schedule> {
        return scheduleRepository.findById(id)
    }
    fun findAll(): List<Schedule> {
        return scheduleRepository.findAll()
    }
    fun update(schedule: Schedule): Schedule{
        schedule.updatedAt = Instant.now()
        return scheduleRepository.save(schedule)
    }
    fun deleteById(id: Long){
        return scheduleRepository.deleteById(id)
    }
}