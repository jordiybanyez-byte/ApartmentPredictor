package com.example.apartment_predictor.controller;


import com.example.apartment_predictor.model.Apartment;
import com.example.apartment_predictor.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/apartment/")
public class ApartmentRestController {

    @Autowired
    ApartmentService apartmentService;

    @GetMapping("/getAll")
    public Iterable<Apartment> getAllApartments(){



        return apartmentService.findAll();
    }


    @GetMapping("/getById/{id}")
    public Apartment getApartmentById(@RequestParam String id){


        return apartmentService.findApartmentById(id);

    }
}
