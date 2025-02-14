package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.Optional;

@Path("/hello")
public class GreetingResource {

    public String title(String title, Optional<Integer> p) {
        Integer n = p.orElse(0);
        return "#".repeat(Math.max(0, n)) + title;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return title("carmaggedon", Optional.of(3));
    }

}


