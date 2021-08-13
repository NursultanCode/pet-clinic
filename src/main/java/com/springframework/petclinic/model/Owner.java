package com.springframework.petclinic.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Data
@Entity
public class Owner extends Person{
    private String address;
    private String city;
    private String telephone;

    @OneToMany
    private Set<Pet> pets;
}
