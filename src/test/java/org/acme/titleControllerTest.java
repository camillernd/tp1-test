package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.acme.controllers.TitleController;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class titleControllerTest {
    @Test
    void testHelloEndpoint() {
        given()
          .when().get("/hello")
          .then()
             .statusCode(200)
             .body(is("Hello RESTEasy"));
    }

    @Test
    void testTitle() {
        TitleController titleController = new TitleController();
        int n = 3;
        List<String> anime = titleController.title(Optional.of(n), Optional.of("carmaggedon"));
        assertEquals("###carmaggedon", anime.get(n));
    }

}