package com.hotel.booking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {
    @GetMapping("/sample")
    public String get(){
        return "hello";
    }
}
