package com.springframework.petclinic.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Data
@Entity
public class Vet extends Person{
    @OneToMany
    private Set<Speciality> specialities;
}
