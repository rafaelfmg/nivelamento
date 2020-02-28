package model.dao

import model.dao.impl.DriverDaoImpl

class DaoFactory {

    fun createDriverDao(): DriverDao {
        return DriverDaoImpl()
    }
}