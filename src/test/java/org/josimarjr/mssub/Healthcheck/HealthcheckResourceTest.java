package org.josimarjr.mssub.Healthcheck;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.*;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;

@QuarkusTest
@Tag("functional-api")
public class HealthcheckResourceTest {

    @Test
    public void testHealthcheckEndpoint() {
        given()
          .when().get("/healthcheck")
          .then()
             .statusCode(200)
             .body("status", equalTo("ok"));
    }

}