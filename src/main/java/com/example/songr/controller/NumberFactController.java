//package com.example.songr.controller;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.client.RestTemplate;
//
//@Controller
//public class NumberFactController {
//
//    @Value("${numbers.api.url}")
//    private String numbersApiUrl;
//
//    @GetMapping("/fact")
//    public ResponseEntity<String> getNumberFact(int number) {
//        RestTemplate restTemplate = new RestTemplate();
//        String apiUrl = numbersApiUrl + "/" + number;
//        String fact = restTemplate.getForObject(apiUrl, String.class);
//        return ResponseEntity.ok(fact);
//    }
//}
