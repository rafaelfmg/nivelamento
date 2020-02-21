package model.dao

import model.entities.Driver

interface DriverDao {

    fun findById(id: Long): Driver?
    fun findByName(name: String): Driver?
    fun findByCnhNumber(cnh_number: String): Driver?
    fun insert(driver: Driver)
}