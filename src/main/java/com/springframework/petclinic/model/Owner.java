package com.springframework.petclinic.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Owner extends Person{
    private String address;
    private String city;
    private String telephone;
    @OneToMany(mappedBy = "owner")
    private Set<Pet> pets;

    @Builder
    public Owner(Long id, String firstName, String lastName,String address, String city, String telephone, Set<Pet> pets) {
        super(id,firstName,lastName);
        this.address = address;
        this.city = city;
        this.telephone = telephone;
        this.pets = pets;
    }
}
