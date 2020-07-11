package com.jsglobe.registration.service.data

import org.springframework.stereotype.Repository
import org.springframework.data.repository.CrudRepository

@Repository
interface PersonRepository : CrudRepository<Person, Long>