package org.josimarjr.mssub.Subtraction;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
@Tag("functional-api")
public class SubtractionResourceTest {

    @Test
    public void testSubtractionEndpointWithIntegers() {
        given()
          .when().get("/subtraction/18/1")
          .then()
             .statusCode(200)
             .body("result", equalTo(17));
    }

    @Test
    public void testSubtractionEndpointWithNegativeIntegers() {
        given()
                .when().get("/subtraction/-1/18")
                .then()
                .statusCode(200)
                .body("result", equalTo(-19));
    }

    @Test
    public void testSubtractionEndpointWithDoubles() {
        given()
                .when().get("/subtraction/-1.03/18.01")
                .then()
                .statusCode(200)
                .body("result", is(-19.04f));
    }

}