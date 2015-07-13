package com.nberserk.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("hello")
@Produces(MediaType.APPLICATION_JSON)
public class Hello {

    @GET
    public Response getIt() {
        Model model = new Model("Darren");
        model.setDesc("description");

        return Response.ok().entity(model).build();
    }
}
