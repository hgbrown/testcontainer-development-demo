# TestContainer in Development Demo

Demonstrates how we can use TestContainers not only during testing but also during development since Spring Boot 3.1.0.

## Documentation:

* [Using Testcontainers at Development Time](https://docs.spring.io/spring-boot/docs/3.1.5/reference/html/features.html#features.testing.testcontainers.at-development-time)
* [Testcontainers Postgres Module Reference Guide](https://java.testcontainers.org/modules/databases/postgres/)
* [Testcontainers](https://java.testcontainers.org/)
* [Flyway Migration](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#howto.data-initialization.migration-tool.flyway)


Testcontainers has been configured to use the following Docker images:

* [`postgres:latest`](https://hub.docker.com/_/postgres)

## Running the application in development mode

Gradle:

```shell
./gradlew bootTestRun
```
