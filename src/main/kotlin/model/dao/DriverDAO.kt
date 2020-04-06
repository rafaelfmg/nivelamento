package model.dao

import model.entities.Driver

interface DriverDao {

    fun findById(id: Long): Driver?
    fun findByName(name: String): ArrayList<Driver>?
    fun insert(driver: Driver)
}