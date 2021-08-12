package com.springframework.petclinic.services;

import com.springframework.petclinic.model.Vet;
import com.springframework.petclinic.repositories.VetRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class VetService {
    private final VetRepository vetRepository;
    public List<Vet> findAllVets(){
        return vetRepository.findAll();
    }
}
