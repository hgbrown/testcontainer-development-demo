package dev.hbrown.testcontainerdevdemo.person

import io.restassured.RestAssured
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.equalTo
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.server.LocalServerPort
import org.springframework.boot.testcontainers.service.connection.ServiceConnection
//import org.springframework.test.context.DynamicPropertyRegistry
//import org.springframework.test.context.DynamicPropertySource
import org.testcontainers.containers.PostgreSQLContainer
import org.testcontainers.junit.jupiter.Container
import org.testcontainers.junit.jupiter.Testcontainers

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Testcontainers
class PersonControllerTest {

    @LocalServerPort
    private var port: Int = -1

    @BeforeEach
    fun setPort() {
        println("*** DB Running on port: $port ***")
        RestAssured.port = port
    }

    @Test
    fun `should be able to get all persons`() {
        RestAssured.port = port
        given()
            .get("/api/person")
            .then()
            .statusCode(200)
            .body("size()", equalTo(3))
    }

    companion object {
        @Container
        @ServiceConnection
        val postgres = PostgreSQLContainer("postgres:latest").apply { start() }

        // no longer required - we can use @ServiceConnection instead
//        @DynamicPropertySource
//        @JvmStatic
//        fun configureProperties(registry: DynamicPropertyRegistry) {
//            registry.add("spring.datasource.url") { postgres.getJdbcUrl() }
//            registry.add("spring.datasource.username") { postgres.username }
//            registry.add("spring.datasource.password") { postgres.password }
//        }
    }

}
