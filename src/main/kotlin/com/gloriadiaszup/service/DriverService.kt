package com.gloriadiaszup.service

import com.gloriadiaszup.model.entities.Driver
import org.springframework.stereotype.Service
import com.gloriadiaszup.repository.DriverRepository
import java.util.*
import kotlin.collections.ArrayList

@Service
class DriverService(private val driverRepository: DriverRepository) {

    fun create(driver: Driver): Driver{
        return driverRepository.save(driver)
    }
    fun findAll(): List<Driver>{
        return driverRepository.findAll() as ArrayList<Driver>
    }
    fun findById(id: Long): Optional<Driver> {
        return driverRepository.findById(id)
    }
    fun deleteById(id: Long){
        driverRepository.deleteById(id)
    }
    fun update(driver: Driver): Driver{
        driver.createdAt = findById(driver.id).get().createdAt
        return driverRepository.save(driver)
    }
}