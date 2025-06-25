package org.example;

import io.restassured.RestAssured;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasKey;

public class SimpleTest {
    @Test
    public void userShouldBeAbleCreateStudent(){
        // given - then - then BDD
        given()
                .body("{\n" +
                         " \"name\": \"Arina Boichenko\",\n" +
                         " \"grade\": 1\n" +
                         " }")
                .post("https://crudcrud.com/api/084d396b9ecc40558a4e12b0271241ba/student")
                .then()
                .assertThat()
                .statusCode(201)
                .body("$", hasKey("_id"));
    }
}

