package com.logicbig.example;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class MyClient1 {
    public static void main(String[] args) {
        //default resource
        getRequest("/reset1", Void.class);
        countRequest("/count1");
        Integer counter = getRequest("/counter1", Integer.class);
        System.out.printf("counter1: %s%n", counter);

        //singleton resource
        getRequest("/reset2", Void.class);
        countRequest("/count2");
        Integer counter2 = getRequest("/counter2", Integer.class);
        System.out.printf("counter2: %s%n", counter2);
    }

    public static void countRequest(String uri) {
        for (int i = 0; i < 10; i++) {
            getRequest(uri, Void.class);
        }
    }

    public static <T> T getRequest(String uri, Class<T> responseType) {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:8080" + uri);
        return target.request().get(responseType);
    }
}