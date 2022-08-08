package com.logicbig.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class MySingletonResource {
    private int counter;

    @GET
    @Path("count2")
    public void count() {
        counter++;
    }

    @GET
    @Path("counter2")
    public int getCounter() {
        return counter;
    }

    @GET
    @Path("reset2")
    public void reset() {
        counter = 0;
    }
}