package com.gloriadiaszup.model.entity

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

@Entity
@EntityListeners(AuditingEntityListener::class)
class Driver (

        @Id
        @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "driver_id_seq")
        var id: Long? = null,
        @Column
        var name: String? = null,
        @Column(name = "cnh_number")
        var cnhNumber: String? = null,
        @Column(name = "date_of_birth", columnDefinition = "date")
        var dateOfBirth: Date? = null,
        @CreatedDate
        @Column(name = "created_at", nullable = false, updatable = false)
        var createdAt: LocalDateTime? = null,
        @LastModifiedDate
        @Column(name = "updated_at", nullable = false)
        var updatedAt: LocalDateTime? = null
)
