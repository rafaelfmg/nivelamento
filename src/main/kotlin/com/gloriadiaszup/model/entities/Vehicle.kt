package com.gloriadiaszup.model.entities

import java.time.Instant
import javax.persistence.*

@Entity
open class Vehicle (
        @Id
        @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "vehicle_id_seq")
         val id: Long? = null,
        @Column
         var plate: String? = null,
        @Column
        var renavam: String? = null,
        @Column(name = "id_driver")
         var idDriver: Long? = null,
        @Column
        val createdAt: Instant? = null,
        @Column
        var updatedAt: Instant? = null
)