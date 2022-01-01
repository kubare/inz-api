package com.example.biuropodrozyapi.security.services;

import com.example.biuropodrozyapi.dto.BookedTripDTO;
import com.example.biuropodrozyapi.models.BookedTrip;
import com.example.biuropodrozyapi.models.PersonalData;
import com.example.biuropodrozyapi.models.Trip;
import com.example.biuropodrozyapi.models.User;
import com.example.biuropodrozyapi.repository.BookedRepository;
import com.example.biuropodrozyapi.repository.TripRepository;
import com.example.biuropodrozyapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookedService {
    @Autowired
    private BookedRepository bookedRepo;
    @Autowired
    private TripRepository tripRepo;
    @Autowired
    private UserRepository userRepo;

    public String book(BookedTripDTO bookedTripDTO) {
        BookedTrip bookedTripA = new BookedTrip();
        bookedTripA.setTrip(tripRepo.findById(bookedTripDTO.getIdTrip()).orElseThrow());
        PersonalData personalData = new PersonalData(
                bookedTripDTO.getFirstName(),
                bookedTripDTO.getLastName(),
                bookedTripDTO.getNumberPhone(),
                bookedTripDTO.getIdCard(),
                bookedTripDTO.getCity(),
                bookedTripDTO.getStreet(),
                bookedTripDTO.getApartamentName(),
                bookedTripDTO.getPostCode()
        );
        bookedTripA.setPersonalData(personalData);
        User user = userRepo.findByUsername(bookedTripDTO.getUsername()).orElseThrow();
        bookedTripA.setUser(user);
        bookedTripA = bookedRepo.save(bookedTripA);

        user.getBookedTrips().add(bookedTripA);

        userRepo.save(user);

        return bookedTripA.get_id();
    }
}
