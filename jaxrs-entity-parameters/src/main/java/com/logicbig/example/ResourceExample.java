package com.logicbig.example;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.model.internal.RankedComparator.Order;

@Path("/")
public class ResourceExample {
	
	
	 @Path("/test3")
	    @POST
	    public Response handle2(String entityParam) {
		 
		 	ArrayList<String> names= new ArrayList<>();
		 	names.add("India");
		 	names.add("Japan");
		 	names.add("Nepal");
		 	GenericEntity<List<String>> genericEntity = new GenericEntity<List<String>>(names) {
		      };
	              
	        return Response.status(200).entity(genericEntity).build();
	    }

    @Path("/test1")
    @POST
    public String handle(String entityParam) {
        System.out.println(entityParam);
        Response.status(200).entity(entityParam).build();
        return "entity parameter: " + entityParam;
    }

    @Path("/test2")
    @POST
    public String handle2(MyMsg entityParam) {
        System.out.println(entityParam);
        return "entity parameter: " + entityParam;
    }
    
}