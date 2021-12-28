package com.example.biuropodrozyapi.security.services;

import java.util.Optional;

import com.example.biuropodrozyapi.models.Trip;
import com.example.biuropodrozyapi.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TripService {

    private TripRepository tripRepo;

    @Autowired
    public TripService(TripRepository tripRepo) {
        this.tripRepo = tripRepo;
    }

    public Optional<Trip> findById(String id) {
        return tripRepo.findById(id);
    }

    public Iterable<Trip> findAll() {
        return tripRepo.findAll();
    }

    public Trip save(Trip trip) {
        return tripRepo.save(trip);
    }

    public void deleteById(String id) {
        tripRepo.deleteById(id);
    }

}

