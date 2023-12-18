package dev.hbrown.testcontainerdevdemo.person

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/person")
class PersonController(
    private val personService: PersonService,
) {
    private val log: Logger = LoggerFactory.getLogger(javaClass)

    @GetMapping
    fun findAll(): List<Person> {
        log.info("Request to list all persons")
        return personService.findAll()
    }
}
