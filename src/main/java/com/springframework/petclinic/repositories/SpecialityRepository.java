package com.springframework.petclinic.repositories;

import com.springframework.petclinic.model.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialityRepository extends JpaRepository<Speciality, Long> {
}
