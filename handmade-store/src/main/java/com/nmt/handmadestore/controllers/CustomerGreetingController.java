package com.nmt.handmadestore.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nmt.handmadestore.models.Greeting;


@RestController
@RequestMapping("/v1")
public class CustomerGreetingController {
    
    private static final String greetingTemplate = "Hello, %s %s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(
        @RequestParam(defaultValue = "0") boolean gender,
        @RequestParam(defaultValue = "Customer") String customerName
    ) {
        return Greeting.builder()
            .id(counter.incrementAndGet())
            .content(greetingTemplate.formatted(gender ? "Mr. " : "Ms. ", customerName)).build();
    }
}
