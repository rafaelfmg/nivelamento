package model.entities
import javax.persistence.*
import kotlin.collections.ArrayList

@Entity
@Table(name = "driver")
data class Driver (

    @Id
    @GeneratedValue
    val id: Long,
    @Column
    var name: String,
    @Column
    var cnh_number: String,
    @Column
    var date_of_birth: String
    //@OneToMany(mappedBy = "driver")
    //var vehicles: List<Vehicle> = ArrayList()


)