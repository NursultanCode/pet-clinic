package com.springframework.petclinic.services;

import com.springframework.petclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
class OwnerServiceTest {

    @Autowired
    OwnerService ownerService;

    @BeforeEach
    void setUp() {
        ownerService.save(Owner.builder().id(1L).build());
    }

    @Test
    void findAll() {
        List<Owner> owners = ownerService.findAll();
        assertEquals(1,owners.size());
    }


    @Test
    void findById() throws Exception {
        assertEquals(1L, ownerService.findById(1L).getId());
    }

    @Test
    void save() {
        Owner owner2 = Owner.builder().id(2L).build();
        Owner saved = ownerService.save(owner2);
        assertEquals(2L, saved.getId());
    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void findByLastName() {
    }
}