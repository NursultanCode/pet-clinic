package com.springframework.petclinic.model;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class PetType extends BaseEntity{
    private String name;
}
