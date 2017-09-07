package controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hcakb on 8/17/2017.
 */
@RestController
@EnableAutoConfiguration
public class DemoResources {

    @RequestMapping("/hi")
    public String getResource() {

        return "hello";
    }

    public int addTwoNumbers(int firstNum, int secondNum) {

        return firstNum + secondNum;
    }
}
