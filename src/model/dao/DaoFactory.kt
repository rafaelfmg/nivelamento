package model.dao

import model.dao.impl.DriverDaoJdbc

class DaoFactory {

    fun createDriverDao(): DriverDao {
        return DriverDaoJdbc()
    }
}