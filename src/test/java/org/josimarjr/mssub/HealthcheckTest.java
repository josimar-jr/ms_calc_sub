package org.josimarjr.mssub;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;

@QuarkusTest
public class HealthcheckTest {

    @Test
    public void testHealthcheckEndpoint() {
        given()
          .when().get("/healthcheck")
          .then()
             .statusCode(200)
             .body("status", equalTo("ok"));
    }

}