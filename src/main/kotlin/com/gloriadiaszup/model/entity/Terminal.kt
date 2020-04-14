package com.gloriadiaszup.model.entity

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table
class Terminal (

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        var id: Long,
        @Column
        var name: String,
        @CreatedDate
        @Column(name = "created_at", nullable = false, updatable = false)
        var createdAt: LocalDateTime?,
        @LastModifiedDate
        @Column(name = "updated_at", nullable = false)
        var updatedAt: LocalDateTime? = null
)