package com.practice.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerTest {

    @LocalServerPort
    private int port;


    @BeforeEach
    void setUp() {

        // Set the base URL and random port for REST Assured
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = port;
    }


    
    // Helper Method - Create a test contact
    private Long createTestContact() {

        // Generate a unique email for every test
        String email = "test" + System.currentTimeMillis() + "@example.com";

        String requestBody = """
                {
                    "firstName": "Test",
                    "lastName": "User",
                    "email": "%s",
                    "phone": "9999999999"
                }
                """.formatted(email);


        // Send POST request to create contact
        Response response =
                given()
                    .contentType("application/json")
                    .body(requestBody)
                .when()
                    .post("/api/v1/contact")
                .then()
                    .statusCode(200)
                    .extract()
                    .response();


        // Get generated ID from response
        Long id = response.jsonPath().getLong("id");

        return id;
    }


    // 1. Create Contact  -  // POST /api/v1/contact

    @Test
    void shouldCreateContact() {

        // Generate unique email
        String email = "avinash" + System.currentTimeMillis() + "@gmail.com";

        String requestBody = """
                {
                    "firstName": "Avinash",
                    "lastName": "Kumar",
                    "email": "%s",
                    "phone": "1231231123"
                }
                """.formatted(email);


        // Send POST request
        given()
            .contentType("application/json")
            .body(requestBody)
        .when()
            .post("/api/v1/contact")
        .then()
            .statusCode(200)
            .body("firstName", equalTo("Avinash"))
            .body("lastName", equalTo("Kumar"))
            .body("email", equalTo(email))
            .body("phone", equalTo("1231231123"));
    }


    // 2. Get All Contacts  -  // GET /api/v1/contact

    @Test
    void shouldGetAllContacts() {

        createTestContact();

        // Get all contacts
        given()
        .when()
            .get("/api/v1/contact")
        .then()
            .statusCode(200);
    }


    // 3. Get Contact By ID  -  // GET /api/v1/contact/{id}

    @Test
    void shouldGetContactById() {

        Long id = createTestContact();

        given()
        .when()
            .get("/api/v1/contact/" + id)
        .then()
            .statusCode(200)
            .body("id", equalTo(id.intValue()))
            .body("firstName", equalTo("Test"))
            .body("lastName", equalTo("User"))
            .body("phone", equalTo("9999999999"));
    }


    // 4. Update Contact  -   // PUT /api/v1/contact/{id}

    @Test
    void shouldUpdateContact() {

        Long id = createTestContact();

        // Generate unique email for updated contact
        String email = "updated" + System.currentTimeMillis() + "@example.com";

        String updateRequest = """
                {
                    "firstName": "Updated",
                    "lastName": "User",
                    "email": "%s",
                    "phone": "1111111111"
                }
                """.formatted(email);


        // Update the contact
        given()
            .contentType("application/json")
            .body(updateRequest)
        .when()
            .put("/api/v1/contact/" + id)
        .then()
            .statusCode(200)
            .body("id", equalTo(id.intValue()))
            .body("firstName", equalTo("Updated"))
            .body("lastName", equalTo("User"))
            .body("email", equalTo(email))
            .body("phone", equalTo("1111111111"));
    }

 
    // 5. Delete Contact  -  // DELETE /api/v1/contact/{id}

    @Test
    void shouldDeleteContact() {

        Long id = createTestContact();

        // Delete the contact
        given()
        .when()
            .delete("/api/v1/contact/" + id)
        .then()
            .statusCode(200);
    }


    // 6. Get Non-Existing Contact  -  // GET /api/v1/contact/{id}

    @Test
    void shouldReturn404WhenContactDoesNotExist() {

        // Use an ID which does not exist
        Long id = 99999999L;


        // Try to get non-existing contact
        given()
        .when()
            .get("/api/v1/contact/" + id)
        .then()
            .statusCode(404);
    }


    // 7. Update Non-Existing Contact  -  // PUT /api/v1/contact/{id}

    @Test
    void shouldReturn404WhenUpdatingNonExistingContact() {

        String updateRequest = """
                {
                    "firstName": "Updated",
                    "lastName": "User",
                    "email": "nonexisting@example.com",
                    "phone": "1111111111"
                }
                """;


        // Try to update a contact which does not exist
        given()
            .contentType("application/json")
            .body(updateRequest)
        .when()
            .put("/api/v1/contact/99999999")
        .then()
            .statusCode(404);
    }


    // 8. Delete Non-Existing Contact  -  // DELETE /api/v1/contact/{id}
    
    @Test
    void shouldReturn404WhenDeletingNonExistingContact() {

        // I am trying to delete a contact which does not exist
        given()
        .when()
            .delete("/api/v1/contact/99999999")
        .then()
            .statusCode(404);
    }

}