package repository

import model.entities.Driver
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.util.*


@Suppress("JpaQlInspection")
@Repository
interface DriverRepository: JpaRepository<Driver, Long>{

    @Suppress("JpaQlInspection")
    @Query("UPDATE driver u SET name =?2, cnh_number = ?3, date_of_birth = ?4 WHERE u.id = ?1")
    fun setDriverInfoById(id: Long?, name: String?, cnh_number: String?, date_of_birth: Date?)
}