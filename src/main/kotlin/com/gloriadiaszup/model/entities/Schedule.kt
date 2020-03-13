package com.gloriadiaszup.model.entities

import java.time.Instant
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table
class Schedule (

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    val id: Long? = null,
    @Column
    val idDriver: Long? = null,
    @Column
    val idVehicle: Long? = null,
    @Column
    val idProduct: Long? = null,
    @Column
    val idTerminal: Long? = null,
    @Column
    val cargoWeight: Int? = null,
    @Column
    val totalValue: Long? = null,
    @Column
    val scheduledAt: LocalDateTime? = null,
    @Column
    val createdAt: Instant? = null,
    @Column
    val updatedAt: Instant? = null
)