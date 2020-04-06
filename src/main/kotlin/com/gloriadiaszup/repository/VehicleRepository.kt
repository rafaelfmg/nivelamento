package com.gloriadiaszup.repository

import com.gloriadiaszup.model.entities.Vehicle
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
@Transactional(readOnly = true)
interface VehicleRepository: JpaRepository<Vehicle, Long> {

    fun findByIdDriver(idDriver: Long): List<Vehicle>
}