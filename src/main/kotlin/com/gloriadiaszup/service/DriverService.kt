package com.gloriadiaszup.service

import com.gloriadiaszup.model.entities.Driver
import org.springframework.stereotype.Service
import com.gloriadiaszup.repository.DriverRepository
import java.util.*
import kotlin.collections.ArrayList

@Service
open class DriverService(private val driverRepository: DriverRepository) {

    fun create(driver: Driver): Driver{
        return driverRepository.save(driver)
    }

    fun findAll(): ArrayList<Driver>{
        return driverRepository.findAll() as ArrayList<Driver>
    }
    fun findById(id: Long): Optional<Driver> {
        return driverRepository.findById(id)
    }
    fun deleteById(id: Long){
        driverRepository.deleteById(id)
    }
    fun delete(driver: Driver){
        driverRepository.delete(driver)
    }
    fun update(driver: Driver): Driver{
        return driverRepository.save(driver)
    }
}