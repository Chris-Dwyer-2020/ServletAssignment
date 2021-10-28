package com.servlets.assignment;

import org.apache.http.client.methods.*;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class HttpClient {

    public static void get(){
        CloseableHttpClient clientTest = HttpClients.createDefault();
        HttpGet gettingRequest = new HttpGet("http://localhost:8080/ServletAssignment/theEndOfTheRoad");
        try {
           clientTest.execute(gettingRequest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void put(){
        CloseableHttpClient clientTest = HttpClients.createDefault();
        HttpPut puttingRequest = new HttpPut("http://localhost:8080/ServletAssignment/theEndOfTheRoad");
        try {
         clientTest.execute(puttingRequest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void delete(){
        CloseableHttpClient clientTest = HttpClients.createDefault();
        HttpDelete deleteRequest = new HttpDelete("http://localhost:8080/ServletAssignment/theEndOfTheRoad");
        try {
           clientTest.execute(deleteRequest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void post(){
        CloseableHttpClient clientTest = HttpClients.createDefault();
        HttpPost postingRequest = new HttpPost("http://localhost:8080/ServletAssignment/theEndOfTheRoad");
        try {
            clientTest.execute(postingRequest);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
