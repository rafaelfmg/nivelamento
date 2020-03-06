package service

import model.entities.Driver
import org.springframework.stereotype.Service
import repository.DriverRepository
import java.util.*
import kotlin.collections.ArrayList

@Service
class DriverService(private val driverRepository: DriverRepository) {

    fun create(driver: Driver){
        driverRepository.save(driver)
    }

    fun findAll(): ArrayList<Driver>{
        return driverRepository.findAll() as ArrayList<Driver>
    }
    fun findById(id: Long): Optional<Driver?>{
        return driverRepository.findById(id)
    }
    fun deleteById(driver: Driver){
        driverRepository.findById(driver.id)
        driverRepository.delete(driver)
    }
    fun delete(driver: Driver){
        driverRepository.delete(driver)
    }
    fun update(driver: Driver){
        driverRepository.setDriverInfoById(driver.id, driver.name, driver.cnh_number, driver.date_of_birth)
    }
}