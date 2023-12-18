package dev.hbrown.testcontainerdevdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TestcontainerDevDemoApplication

fun main(args: Array<String>) {
    runApplication<TestcontainerDevDemoApplication>(*args)
}
