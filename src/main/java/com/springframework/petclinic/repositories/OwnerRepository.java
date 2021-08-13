package com.springframework.petclinic.repositories;

import com.springframework.petclinic.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
    List<Owner> findAllByLastName(String lastName);
}
