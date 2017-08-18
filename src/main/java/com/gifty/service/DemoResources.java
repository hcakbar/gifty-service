package com.gifty.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hcakb on 8/17/2017.
 */
@RestController
public class DemoResources {

    @RequestMapping("/hi")
    public String getResource() {
        return "hello";
    }
}
