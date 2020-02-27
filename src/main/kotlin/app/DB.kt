package application

import java.io.FileInputStream
import java.io.IOException
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException
import java.util.*

open class DB {

    private var conn: Connection? = null

    fun getConnection(): Connection? {
        if (conn == null) {
            try {
                val props: Properties = loadProperties()
                val url: String = props.getProperty("dburl")
                conn = DriverManager.getConnection(url, props)
            }
            catch (e: SQLException) {
                throw SQLException(e.message)
            }
        }
        return conn
    }

    fun closeConnection() {
        if (conn != null) {
            try {
                conn!!.close()
            } catch (e: SQLException) {
                throw SQLException(e.message)
            }
        }
    }

    private fun loadProperties(): Properties {
        try {val fs= FileInputStream("db.properties")
            val props = Properties()
            props.load(fs)
            return props
        }
            catch (e: IOException) {
                throw IOException(e.message)
            }
        }
}