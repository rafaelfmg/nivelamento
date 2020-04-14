package com.gloriadiaszup.model.entity

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@EntityListeners(AuditingEntityListener::class)
open class Schedule (

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    var id: Long? = null,
    @Column
    var idDriver: Long? = null,
    @Column
    var idVehicle: Long? = null,
    @Column
    var idProduct: Long? = null,
    @Column
    var idTerminal: Long? = null,
    @Column
    var cargoWeight: Int? = null,
    @Column
    var totalValue: Long? = null,
    @Column
    var scheduledAt: LocalDateTime? = null,
    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    var createdAt: LocalDateTime? = null,
    @LastModifiedDate
    @Column(name = "updated_at", nullable = false)
    var updatedAt: LocalDateTime? = null
)