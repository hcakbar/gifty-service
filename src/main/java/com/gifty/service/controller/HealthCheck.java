package com.gifty.service.controller;

import com.gifty.service.utils.MappingConstants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hcakb on 10/7/2017.
 */

@RestController
@RequestMapping(value = MappingConstants.PRODUCTS)
public class HealthCheck {

    @GetMapping("/health")
    public String getHelth() {
        return "{\"status\":\"UP\"}";
    }

    //TODO add to check the database connection health

}
