package com.gloriadiaszup.repository

import com.gloriadiaszup.model.entity.Schedule
import org.springframework.data.jpa.repository.JpaRepository

interface ScheduleRepository: JpaRepository<Schedule, Long>