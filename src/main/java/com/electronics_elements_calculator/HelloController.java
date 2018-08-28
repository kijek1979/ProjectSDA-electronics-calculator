package com.electronics_elements_calculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



    @RestController
    public class HelloController {
        @RequestMapping("/controler")
        public String index() {
            return "Your first Spring application.";
        }

}
