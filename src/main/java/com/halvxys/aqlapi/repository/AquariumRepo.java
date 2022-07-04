package com.halvxys.aqlapi.repository;

import com.halvxys.aqlapi.models.Aquarium;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AquariumRepo extends JpaRepository<Aquarium, Long> {
}
