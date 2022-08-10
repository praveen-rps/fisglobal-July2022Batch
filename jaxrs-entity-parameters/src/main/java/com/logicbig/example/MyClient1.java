package com.logicbig.example;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class MyClient1 {
    public static void main(String[] args) {

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:8080/test1");
        String response = target.request()
                                .post(Entity.entity("test body", MediaType.TEXT_PLAIN_TYPE), String.class);
        System.out.println(response);
    }
}