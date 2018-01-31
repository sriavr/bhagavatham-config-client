package com.sridhar;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BhagavanController {

    @Value("${bhagavan}") String bhagavan;

    @Value("${leela}") String leela;

    @GetMapping("/bhagavan")
    public String showBhagavan() {
        return "Bhagavan is: " + bhagavan;
    }

    @GetMapping("/leela")
    public String showLeela() {
        return "Leela is: " + leela;
    }
}
