package com.gloriadiaszup.model.entities

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@EntityListeners(AuditingEntityListener::class)
class Schedule (

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    val id: Long,
    @Column
    val idDriver: Long,
    @Column
    val idVehicle: Long,
    @Column
    val idProduct: Long,
    @Column
    val idTerminal: Long,
    @Column
    val cargoWeight: Int,
    @Column
    val totalValue: Long,
    @Column
    val scheduledAt: LocalDateTime?,
    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    var createdAt: LocalDateTime?,
    @LastModifiedDate
    @Column(name = "updated_at", nullable = false)
    var updatedAt: LocalDateTime? = null
)