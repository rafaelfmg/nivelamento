package com.gloriadiaszup.repository

import com.gloriadiaszup.model.entities.Driver
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DriverRepository: JpaRepository<Driver, Long>