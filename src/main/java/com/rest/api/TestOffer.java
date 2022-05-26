package com.rest.api;


import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
@Stateless
public class TestOffer {
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello world and Egor!";
    }
}
