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
         var id: Long? = null,
        @Column
         var plate: String? = null,
        @Column
        var renavam: String? = null,
        @Column(name = "id_driver")
         var idDriver: Long? = null,
        @CreatedDate
        @Column(name = "created_at", nullable = false, updatable = false)
        var createdAt: LocalDateTime? = null,
        @LastModifiedDate
        @Column(name = "updated_at", nullable = false)
        var updatedAt: LocalDateTime? = null
)