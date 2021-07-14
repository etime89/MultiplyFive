package com.example.multiplyfive.controller;

import com.example.multiplyfive.model.MultiplyResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping("/multiply")
public class MultiplicationController {

    @GetMapping("/fivetimes/{numberInput}")
    public MultiplyResponse multiplyFive(@PathVariable String numberInput) {

        MultiplyResponse response = new MultiplyResponse();
        try {
            BigInteger input = new BigInteger(numberInput);
            BigInteger answer = BigInteger.valueOf(5).multiply(input);
            response.setAnswer(answer.toString());
        } catch (Exception e) {
            response.setAnswer("Invalid input. Enter an integer");
        }

        return response;
    }
}
