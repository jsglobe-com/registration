package com.jsglobe.registration.api

import com.jsglobe.registration.service.PersonService
import com.jsglobe.registration.service.model.PersonCreateDTO
import com.jsglobe.registration.service.model.PersonDTO
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.PathVariable

@RestController
class RegistrationController(private val personService: PersonService) {
    @GetMapping("/api/1/person")
    fun all() = personService.fetchAll()

    @PostMapping("/api/1/person")
    fun createPerson(@RequestBody person: PersonCreateDTO) = personService.create(person)

    @PutMapping("/api/1/person")
    fun createPerson(@RequestBody person: PersonDTO) = personService.update(person)

    @GetMapping("/api/1/person/{personId}")
    fun getPerson(@PathVariable("personId") personId: Long) = personService.fetch(personId)

    @DeleteMapping("/api/1/person/{personId}")
    fun deletePerson(@PathVariable("personId") personId: Long) = personService.delete(personId)
}

