package com.example.biuropodrozyapi.repository;

import com.example.biuropodrozyapi.models.BookedTrip;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookedRepository extends MongoRepository<BookedTrip, String> {
}
