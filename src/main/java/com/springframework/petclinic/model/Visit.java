package com.springframework.petclinic.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Data
@Entity
public class Visit extends BaseEntity{
    private LocalDate date;
    private String description;
    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;
}
