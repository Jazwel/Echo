package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class EchoPostmanTest {

  @Test
  void CheckTheBody() {

    given()
            .baseUri("https://postman-echo.com")
            .body("echo") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
            .when()
            .post("/post")
// Проверки
            .then()
            .statusCode(200)
            .body("data",equalTo("echo"));

  }
}
