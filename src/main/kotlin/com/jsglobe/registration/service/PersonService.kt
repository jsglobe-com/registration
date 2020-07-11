package com.jsglobe.registration.service

import com.jsglobe.registration.service.data.PersonRepository
import com.jsglobe.registration.service.mapper.PersonMapper
import com.jsglobe.registration.service.model.PersonCreateDTO
import com.jsglobe.registration.service.model.PersonDTO
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import java.lang.RuntimeException

@Service
class PersonService(
        private val personRepository: PersonRepository,
        private val personMapper: PersonMapper
) {
    fun fetch(id: Long) = personRepository
            .findById(id)
            .map(personMapper::mapPerson)
            .orElseThrow { RuntimeException("Not found") }

    fun fetchAll() = personRepository
            .findAll()
            .map(personMapper::mapPerson)

    fun delete(id: Long) = personRepository
            .deleteById(id)

    fun create(person: PersonCreateDTO) = personMapper.mapCreate(person)
            .let(personRepository::save)
            .let(personMapper::mapPerson)

    fun update(personDTO: PersonDTO) {
        val person = personRepository.findById(personDTO.id)
                .orElseThrow { RuntimeException("Not found") }
        val newPerson = personMapper.updatePerson(person, personDTO)
        personRepository.save(newPerson)
    }
}
