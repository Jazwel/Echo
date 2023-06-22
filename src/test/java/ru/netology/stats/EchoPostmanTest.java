package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class EchoPostmanTest {

    @Test
    void CheckTheBody() {

        given()
                .baseUri("https://postman-echo.com")
                .body("echo") //
                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("echo"));

    }
}
