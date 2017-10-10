package com.gifty.service.controller;

import com.gifty.service.repository.ProductRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

/**
 * Created by hcakb on 10/8/2017.
 */

@RunWith(MockitoJUnitRunner.class)
public class ProductControllerTest {

    @Autowired
    private ProductController productController;

    @Mock
    private ProductRepository productRepository;

    @Test
    public void verifyGetAllProduct() {

        List list = new ArrayList();
        list.add("blah");
        when(productRepository.findAll()).thenReturn(list);
    }

}
