package com.example.biuropodrozyapi.controllers;

import com.example.biuropodrozyapi.models.Trip;
import com.example.biuropodrozyapi.models.User;
import com.example.biuropodrozyapi.security.services.TripService;
import com.example.biuropodrozyapi.security.services.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/user")
public class UserController {
    private TripService trips;
    private UserDetailsServiceImpl users;

    @Autowired
    public UserController(TripService trips, UserDetailsServiceImpl users) {
        this.trips = trips;
        this.users = users;
    }

    @GetMapping("/alltrips")
    public Iterable<Trip> getAll() {
        return trips.findAll();
    }
}