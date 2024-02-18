package ar.com.lambdastuto.java9;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientSample {

    public static void main(String[] args) throws IOException, InterruptedException {

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.google.com"))
                .build();

        HttpResponse response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("response http: "+ response.body());

        
    }
}
