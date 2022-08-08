package com.logicbig.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.concurrent.atomic.AtomicInteger;

@Path("/")
public class MySingletonResource2 {
    private AtomicInteger counter = new AtomicInteger(0);

    @GET
    @Path("count3")
    public void count() {
        counter.incrementAndGet();
    }

    @GET
    @Path("counter3")
    public int getCounter() {
        return counter.get();
    }

    @GET
    @Path("reset3")
    public void reset() {
        counter.set(0);
    }
}