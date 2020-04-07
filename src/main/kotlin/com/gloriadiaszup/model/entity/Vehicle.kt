package com.gloriadiaszup.model.entity

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@EntityListeners(AuditingEntityListener::class)
open class Vehicle (
        @Id
        @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "vehicle_id_seq")
         val id: Long,
        @Column
         var plate: String,
        @Column
        var renavam: String,
        @Column(name = "id_driver")
         var idDriver: Long,
        @CreatedDate
        @Column(name = "created_at", nullable = false, updatable = false)
        var createdAt: LocalDateTime?,
        @LastModifiedDate
        @Column(name = "updated_at", nullable = false)
        var updatedAt: LocalDateTime? = null
)