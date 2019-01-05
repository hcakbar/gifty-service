package com.gifty.service.domain;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by hcakb on 10/8/2017.
 */
public class ProductTest {

    private Product product;

    @Test
    public void checkProduct() {
        String description = "This is description";
        product = new Product("", description, "", "");
        assertTrue(product.getDescription().equals(description));
    }

}
