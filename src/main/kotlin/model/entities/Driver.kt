package model.entities
import java.util.*
import javax.persistence.*

@Entity
open class Driver (

    @Id
    val id: Long? = null,
    @Column
    var name: String? = null,
    @Column
    var cnh_number: String? = null,
    @Column
    var date_of_birth: Date? = null
)
