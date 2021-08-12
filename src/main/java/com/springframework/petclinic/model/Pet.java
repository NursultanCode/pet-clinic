package com.springframework.petclinic.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Pet {
    private PetType petType;
    private Owner owner;
    private LocalDateTime birthDate;
}
