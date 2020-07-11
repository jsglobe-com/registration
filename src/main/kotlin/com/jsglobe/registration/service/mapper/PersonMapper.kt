package com.jsglobe.registration.service.mapper

import com.jsglobe.registration.service.data.Person
import com.jsglobe.registration.service.model.PersonCreateDTO
import com.jsglobe.registration.service.model.PersonDTO
import org.springframework.stereotype.Component

@Component
class PersonMapper {
    fun mapPerson(person: Person) = PersonDTO(
            person.id,
            person.name,
            person.surname
    )

    fun mapCreate(person: PersonCreateDTO) = Person().apply {
        name = person.name!!
        surname = person.family!!
    }

    fun updatePerson(person: Person, personDTO: PersonDTO) = person.apply {
        name = personDTO.name
        surname = personDTO.family
    }
}