package com.example.biuropodrozyapi.controllers;

import com.example.biuropodrozyapi.models.Trip;
import com.example.biuropodrozyapi.models.User;
import com.example.biuropodrozyapi.security.services.TripService;
import com.example.biuropodrozyapi.security.services.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin(origins = "*", maxAge = 3600)
public class AdminController {

    @Autowired
    private TripService trips;
    private UserDetailsServiceImpl users;

    @Autowired
    public AdminController(TripService trips, UserDetailsServiceImpl users) {
        this.trips = trips;
        this.users = users;
    }

    @GetMapping("/listtrips")
    @PreAuthorize("hasRole('ADMIN')")
    public Iterable<Trip> getAll() {
        return trips.findAll();
    }

    @GetMapping("/listusers")
    @PreAuthorize("hasRole('ADMIN')")
    public Iterable<User> getAllUsers() {
        return users.findAll();
    }

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public Optional<Trip> getById(@RequestParam String index) {
        return trips.findById(index);
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public Trip addTrip(@RequestBody Trip trip) {
        return trips.save(trip);
    }

    @PutMapping
    @PreAuthorize("hasRole('ADMIN')")
    public Trip updateTrip(@RequestBody Trip trip) {
        return trips.save(trip);
    }

    @DeleteMapping("/admintrip")
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteTrip(@RequestParam String index) {
        trips.deleteById(index);
    }
}

