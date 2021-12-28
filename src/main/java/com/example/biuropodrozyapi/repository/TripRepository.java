package com.example.biuropodrozyapi.repository;

import com.example.biuropodrozyapi.models.Trip;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripRepository extends MongoRepository<Trip, String> {
}
