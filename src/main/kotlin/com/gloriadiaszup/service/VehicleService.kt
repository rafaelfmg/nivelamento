package com.gloriadiaszup.service

import com.gloriadiaszup.model.entities.Vehicle
import org.springframework.stereotype.Service
import com.gloriadiaszup.repository.VehicleRepository
import org.springframework.transaction.annotation.Transactional
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
        vehicle.createdAt = findById(vehicle.id).get().createdAt
        return vehicleRepository.save(vehicle)
    }
}