package com.springframework.petclinic.services;

import com.springframework.petclinic.repositories.PetTypeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PetTypeService {
    private final PetTypeRepository petTypeRepository;
}
