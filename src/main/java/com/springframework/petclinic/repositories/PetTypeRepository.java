package com.springframework.petclinic.repositories;

import com.springframework.petclinic.model.PetType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetTypeRepository extends JpaRepository<PetType, Long> {
}
