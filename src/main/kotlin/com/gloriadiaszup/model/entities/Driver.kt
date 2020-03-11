package com.gloriadiaszup.model.entities
import java.util.*
import javax.persistence.*

@Entity
open class Driver (

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "driver_id_seq")
    val id: Long? = null,
    @Column
    var name: String? = null,
    @Column(name = "cnh_number")
    var cnhNumber: String? = null,
    @Column(name = "date_of_birth")
    var dateOfBirth: Date? = null
)
