package com.springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VetController {

    @GetMapping({"/vets","/vets/index"})
    public String getVetIndexPage(){
        return "vets/index";
    }
}
