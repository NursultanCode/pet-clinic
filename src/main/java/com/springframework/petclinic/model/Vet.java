package com.springframework.petclinic.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import java.util.Set;

@Data
@Entity
public class Vet extends Person{
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Speciality> specialities;
}
