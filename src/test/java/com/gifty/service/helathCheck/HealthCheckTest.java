package com.gifty.service.helathCheck;

import org.junit.Test;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertEquals;

/**
 * Created by hcakb on 8/22/2017.
 */
public class HealthCheckTest {

    private static String uri = "http://localhost:8080/product/v1/";
    private static ResponseEntity<String> response;
    private static HttpHeaders headers;
    private static TestRestTemplate restTemplate;
    private static HttpEntity<String> httpEntity;

    public ResponseEntity<String> resourceClient(String uri, HttpMethod methodType) {
        headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        headers.add("Accept", "application/json");
        restTemplate = new TestRestTemplate();
        httpEntity = new HttpEntity<>(null, headers);
        return restTemplate.exchange(uri, methodType, httpEntity, String.class);
    }

    @Test
    public void verifyHealth() {
        response = resourceClient(uri + "health", HttpMethod.GET);
        assertEquals("Failed, status code mismatch", 200, response.getStatusCodeValue());
        assertEquals("Failed, status code mismatch", "{\"status\":\"UP\"}", response.getBody().toString().trim());
    }

}
