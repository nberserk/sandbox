package com.nberserk.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Api(value="/hello", description="hello APIs")
@Path("hello")
public class Hello {

    static Model model;
    static {
        model = new Model("Darren");
        model.setDesc("description");
    }

    @ApiOperation(value = "", notes = "Gets model (text)", response = Model.class)
    @Path("/text")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getText(){
        return model.toString();
    }

    @ApiOperation(value = "", notes = "Gets model (json)", response = Model.class)
    @Path("/json")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJson() {
        return Response.ok().entity(model).build();
    }

    @ApiOperation(value = "", notes = "Gets model (xml)", response = Model.class)
    @Path("/xml")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Response getXml(){
        return Response.ok().entity(model).build();
    }
}
