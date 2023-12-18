package dev.hbrown.testcontainerdevdemo

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.testcontainers.service.connection.ServiceConnection
import org.testcontainers.containers.PostgreSQLContainer
import org.testcontainers.junit.jupiter.Container

@SpringBootTest
class TestcontainerDevDemoApplicationTests {


    @Test
    fun contextLoads() {
    }


    companion object {
        @Container
        @ServiceConnection
        val postgres = PostgreSQLContainer("postgres:latest").apply { start() }
    }

}
