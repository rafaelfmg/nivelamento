package com.gloriadiaszup.model.entities

import java.time.Instant
import javax.persistence.*

@Entity
@Table
open class Product(

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        val id: Long? = null,
        @Column
        val name: String? = null,
        @Column
        val value: String? = null,
        @Column
        val createdAt: Instant? = null,
        @Column
        val updatedAt: Instant? = null
)