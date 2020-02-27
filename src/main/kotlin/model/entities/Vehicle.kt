package model.entities

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "driver")
class Vehicle (
    @Id
    val id: Long,
    @Column
    var plate: String,
    @Column
    var renavam: String,
    @Column
    var id_driver: Long? = null
)