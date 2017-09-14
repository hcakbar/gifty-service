package com.gifty.service;

import controller.DemoResources;
import org.junit.Ignore;
import org.junit.Test;

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

}
