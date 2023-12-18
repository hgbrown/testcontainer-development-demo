package dev.hbrown.testcontainerdevdemo.person

import org.springframework.stereotype.Service

interface PersonService: PersonRepository


@Service
class PersonServiceImpl(
    private val personRepository: PersonRepository,
): PersonService, PersonRepository by personRepository
