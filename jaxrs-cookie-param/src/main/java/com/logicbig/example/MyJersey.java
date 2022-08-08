package com.logicbig.example;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/fis")
public class MyJersey {
	
	@GET
    @Path("/test1")
	@Produces(MediaType.APPLICATION_JSON)
    public String getMsg1()
    {
         return "Hello World !! - Jersey 2";
    }
	
	@POST
    @Path("/test2")
	@Produces(MediaType.APPLICATION_JSON)
    public String getMsg2()
    {
         return "Hello World !! - POST Jersey 2";
    }


}
