package com.example.biuropodrozyapi.repository;

import java.util.Optional;

import com.example.biuropodrozyapi.models.ERole;
import com.example.biuropodrozyapi.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
