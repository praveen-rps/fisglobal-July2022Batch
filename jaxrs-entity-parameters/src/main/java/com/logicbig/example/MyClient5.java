package com.logicbig.example;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class MyClient5 {
    public static void main(String[] args) {

        //Preparing json message
        String entity =    "{\"msg\": \"hello\", \"id\": 5}";

        //sending  requests
        Client client = ClientBuilder.newClient();
        //sending to test1
        WebTarget target = client.target("http://localhost:8080/test1");

        String response = target.request()
                                .post(Entity.entity(entity, MediaType.APPLICATION_JSON_TYPE), String.class);
        System.out.println(response);

        //sending to test2
        WebTarget target2 = client.target("http://localhost:8080/test2");

        String response2 = target2.request()
                                .post(Entity.entity(entity, MediaType.APPLICATION_JSON_TYPE), String.class);
        System.out.println(response2);
    }
}