package com.logicbig.example;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import java.util.Date;

public class MyClient {
    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:8080/test2");
        Invocation.Builder builder = target.request();
        String response = builder.cookie("name1", "value1")
                                 .cookie("name2", "value2")
                                 .get(String.class);
        System.out.println(response);
        client.close();
    }
}