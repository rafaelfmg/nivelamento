package com.gloriadiaszup.service

import com.gloriadiaszup.model.entities.Vehicle
import org.springframework.stereotype.Service
import com.gloriadiaszup.repository.VehicleRepository
import java.util.*

@Service
class VehicleService(private val vehicleRepository: VehicleRepository){

    fun create(vehicle: Vehicle): Vehicle{
       return vehicleRepository.save(vehicle)
    }
    fun findAll(): List<Vehicle>{
        return vehicleRepository.findAll() as ArrayList<Vehicle>
    }
    fun findById(id: Long): Optional<Vehicle?>{
        return vehicleRepository.findById(id)
    }
    fun deleteById(id: Long){
        vehicleRepository.deleteById(id)
    }
    fun update(vehicle: Vehicle): Vehicle{
        return vehicleRepository.save(vehicle)
    }
}