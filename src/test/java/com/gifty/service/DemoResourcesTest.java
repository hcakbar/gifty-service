package com.gifty.service;

import org.json.JSONException;
import org.junit.Test;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertEquals;

/**
 * Created by hcakb on 8/17/2017.
 */
public class DemoResourcesTest {

    private DemoResources demoResources = new DemoResources();

    @Test
    public void testGetHiResource() {
        assertEquals("hello", demoResources.getResource());
    }

    @Test
    public void testAddTwoNumbers() {
        assertEquals(6, demoResources.addTwoNumbers(3, 3));
    }

    //Integration test with SpringBoot TestRestTemplate
    @Test
    public void verifyHiResourceReturnsValidResponse() throws JSONException {
        HttpHeaders headers = new HttpHeaders();
        TestRestTemplate restTemplate = new TestRestTemplate();
        HttpEntity<String> entity = new HttpEntity<> (null, headers);
        ResponseEntity<String> response = restTemplate.exchange("http://localhost:8080/hi", HttpMethod.GET, entity, String.class);
        assertEquals(200, response.getStatusCodeValue());
        assertEquals("hello", response.getBody());
    }

}
