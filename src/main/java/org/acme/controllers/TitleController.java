package org.acme.controllers;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.acme.services.TitleService;

import java.util.List;
import java.util.Optional;

@Path("/titre")
public class TitleController {
    @Inject
    TitleService titleService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/")
    public List<String> title(@QueryParam("p") Optional<Integer> p, Optional<String> title) {
        int n = p.orElse(0);
        if (n < 0) {
            n = 0;
        }
        List<String> anime = titleService.animation(n, title.orElse("carmaggedon"));
        return anime;
    }

}


