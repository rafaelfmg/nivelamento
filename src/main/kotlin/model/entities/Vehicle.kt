package model.entities

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
open class Vehicle (
    @Id
    val id: Long? = null,
    @Column
    var plate: String? = null,
    @Column
    var renavam: String? = null,
    @Column
    var id_driver: Long? = null
)