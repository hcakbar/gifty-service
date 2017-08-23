package com.gifty.service;

import com.gifty.service.helper.TestHelper;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertEquals;

/**
 * Created by hcakb on 8/22/2017.
 */
public class SmokeTest extends TestHelper{

    private static String uri = "http://localhost:8080/"; //TODO move to properties
    private static ResponseEntity<String> response;

    @Test
    public void verifyHealth() {
        response = resourceClient(uri + "health", HttpMethod.GET);
        assertEquals("Failed, status code mismatch", 200, response.getStatusCodeValue());
        assertEquals("Failed, status code mismatch", "{\"status\":\"UP\"}", response.getBody().toString().trim());
    }

}
