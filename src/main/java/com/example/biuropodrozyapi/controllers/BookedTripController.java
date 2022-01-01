package com.example.biuropodrozyapi.controllers;

import com.example.biuropodrozyapi.dto.BookedTripDTO;
import com.example.biuropodrozyapi.models.BookedTrip;
import com.example.biuropodrozyapi.repository.BookedRepository;
import com.example.biuropodrozyapi.security.services.BookedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/trip/book")
public class BookedTripController {

    @Autowired
    private BookedService bookedService;

    @PostMapping
    public String bookTrip(@RequestBody BookedTripDTO bookedTripDTO) {
        return bookedService.book(bookedTripDTO);
    }

}
