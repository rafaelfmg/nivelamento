package main.kotlin.model.dao

import main.kotlin.model.dao.impl.DriverDaoJdbc
import model.dao.DriverDao

class DaoFactory {

    fun createDriverDao(): DriverDao {
        return DriverDaoJdbc()
    }
}