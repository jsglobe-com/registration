package com.jsglobe.registration.service.data

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Person {
    @Id
    @GeneratedValue
    var id: Long = 0
    var name: String = ""
    var surname: String = ""
}