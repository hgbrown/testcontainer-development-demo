package dev.hbrown.testcontainerdevdemo.person

import jakarta.persistence.*

@Entity
@Table(name = "person")
class Person(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_id_generator")
    @SequenceGenerator(name = "person_id_generator", sequenceName = "person_id_seq", allocationSize = 1)
    val id: Long? = null,

    @Column(name = "name")
    val name: String,
) {
    override fun toString(): String {
        return "Person(id=$id, name='$name')"
    }
}
