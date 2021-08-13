package com.springframework.petclinic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
public class Person extends BaseEntity{
    private String firstName;
    private String lastName;



    public Person(Long id, String firstName, String lastName) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
    }



}
