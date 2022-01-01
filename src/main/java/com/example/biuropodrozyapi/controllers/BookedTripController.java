package com.example.biuropodrozyapi.controllers;

import com.example.biuropodrozyapi.dto.BookResponseDTO;
import com.example.biuropodrozyapi.dto.BookedTripDTO;
import com.example.biuropodrozyapi.models.BookedTrip;
import com.example.biuropodrozyapi.repository.BookedRepository;
import com.example.biuropodrozyapi.security.services.BookedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/trip/book")
public class BookedTripController {

    @Autowired
    private BookedService bookedService;

    @GetMapping
    public List<BookResponseDTO> findAllBookedTrips() {
        return bookedService.findAllBookedTrips().stream().map(item -> new BookResponseDTO(
                item.get_id(),
                item.getTrip().get_id(),
                item.getTrip().getCountry(),
                item.getUser().getUsername(),
                item.getPersonalData().getFirstName(),
                item.getPersonalData().getLastName(),
                item.getPersonalData().getNumberPhone(),
                item.getPersonalData().getIdCard(),
                item.getPersonalData().getCity(),
                item.getPersonalData().getStreet(),
                item.getPersonalData().getApartamentName(),
                item.getPersonalData().getPostCode()
        )).collect(Collectors.toList());

    }

    @PostMapping
    public String bookTrip(@RequestBody BookedTripDTO bookedTripDTO) {
        return bookedService.book(bookedTripDTO);
    }

}
