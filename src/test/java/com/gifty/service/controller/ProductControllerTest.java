package com.gifty.service.controller;

import com.gifty.service.repository.ProductRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

/**
 * Created by hcakb on 10/8/2017.
 */

@RunWith(MockitoJUnitRunner.class)
public class ProductControllerTest {

    private ProductController productController;

    @Mock
    private ProductRepository productRepository;

    @Before
    public void setUp() {
        productController = new ProductController(productRepository);
    }

    @Test
    public void verifyGetAllProduct() {
        List list = new ArrayList();
        list.add("blah");
        when(productRepository.findAll()).thenReturn(list);
    }

}
