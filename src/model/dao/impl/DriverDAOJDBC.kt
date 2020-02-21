package model.dao.impl

import application.DB
import model.dao.DriverDao
import model.entities.Driver
import java.sql.*
import java.text.ParseException

class DriverDaoJdbc: DriverDao {

    private var rs: ResultSet? = null
    private var st: Statement? = null

    override fun findById(id: Long): Driver? {

        val conn: Connection? = DB().getConnection()
        var driver: Driver? = null

        try {
            st = conn!!.createStatement()
            rs = st!!.executeQuery("select *from driver where id = $id")

            while (rs!!.next()) {
                driver = Driver(rs!!.getLong("id"), rs!!.getString("name"),
                    rs!!.getString("date_of_birth"), rs!!.getString("cnh_number"))
            }
        } catch (e: SQLException) {
            e.printStackTrace()
        } catch (e: ParseException) {
            e.printStackTrace()
        } finally {
            DB().closeConnection()
            return driver
        }
    }

    override fun findByName(name: String): Driver? {

        val conn: Connection? = DB().getConnection()
        var driver: Driver? = null
        try {
            st = conn!!.createStatement()
            rs = st!!.executeQuery("select *from driver where name = '$name'")

            while (rs!!.next()) {
                driver = Driver(rs!!.getLong("id"), rs!!.getString("name"),
                    rs!!.getString("date_of_birth"), rs!!.getString("cnh_number"))
            }
        } catch (e: SQLException) {
            e.printStackTrace()
        } catch (e: ParseException) {
            e.printStackTrace()
        } finally {
            DB().closeConnection()
            return driver
        }
    }

    override fun findByCnhNumber(cnh_number: String): Driver? {

        val conn: Connection? = DB().getConnection()
        var driver: Driver? = null
        try {
            st = conn!!.createStatement()
            rs = st!!.executeQuery("select *from driver where cnh_number = '$cnh_number'")

            while (rs!!.next()) {
                driver = Driver(rs!!.getLong("id"), rs!!.getString("name"),
                    rs!!.getString("date_of_birth"), rs!!.getString("cnh_number"))
            }
        } catch (e: SQLException) {
            e.printStackTrace()
        } catch (e: ParseException) {
            e.printStackTrace()
        } finally {
            DB().closeConnection()
            return driver
        }
    }

    override fun insert(driver: Driver) {

        val conn: Connection? = DB().getConnection()
        conn!!.autoCommit = false

        try {
            st = conn.createStatement()

            st!!.executeUpdate("Insert into driver VALUES ("+driver.id +", '" +driver.name +"', '" +driver.cnh_number +"', '" +driver.date_of_birth +"')")
            conn.commit()
        } catch (e: SQLException) {
            try {
                conn.rollback()
                System.out.println("Successfully rolled back changes from the database!" +e.message)
            }
         catch (e1: SQLException) {
            System.out.println("Could not rollback updates " + e1.message)
            }
        }
    }

}