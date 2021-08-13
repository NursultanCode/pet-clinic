package com.springframework.petclinic.services;

import com.springframework.petclinic.repositories.SpecialityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SpecialityService {
    private final SpecialityRepository specialityRepository;
}
