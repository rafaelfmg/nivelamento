package com.gloriadiaszup.model.entity

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

@Entity
@EntityListeners(AuditingEntityListener::class)
open class Driver (

        @Id
        @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "driver_id_seq")
        val id: Long?,
        @Column
        var name: String?,
        @Column(name = "cnh_number")
        var cnhNumber: String?,
        @Column(name = "date_of_birth")
        var dateOfBirth: Date?,
        @CreatedDate
        @Column(name = "created_at", nullable = false, updatable = false)
        var createdAt: LocalDateTime?,
        @LastModifiedDate
        @Column(name = "updated_at", nullable = false)
        var updatedAt: LocalDateTime? = null
){
        constructor(): this(null, null, null,  null, null, null)
}
