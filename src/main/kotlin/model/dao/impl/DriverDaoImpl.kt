package model.dao.impl

import model.dao.DriverDao
import model.entities.Driver
import java.sql.SQLException
import javax.persistence.Persistence

class DriverDaoImpl : DriverDao {

    private var emf = Persistence.createEntityManagerFactory("test-jpa")

    override fun findById(id: Long): Driver? {
        val em = emf.createEntityManager()
        return em.find(Driver::class.java, id)
    }

    override fun findByName(name: String): Driver? {
        val em = emf.createEntityManager()
        return em.find(Driver::class.java, name)
    }

    override fun findByCnhNumber(cnh_number: String): Driver? {
        val em = emf.createEntityManager()
        return em.find(Driver::class.java, cnh_number)
    }

    override fun insert(driver: Driver) {
        val em = emf.createEntityManager()
        try {
            em.transaction.begin()
            em.persist(driver)
            em.transaction.commit()
        }catch(e: SQLException){
            try{
                em.transaction.rollback()
            }catch (e1: SQLException){
                e.printStackTrace()
            }
        }

    }
}