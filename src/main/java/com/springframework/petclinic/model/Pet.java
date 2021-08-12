package com.springframework.petclinic.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Data
@Entity
public class Pet extends BaseEntity{
    @ManyToOne
    private PetType petType;
    @ManyToOne
    private Owner owner;
    private LocalDateTime birthDate;
}
