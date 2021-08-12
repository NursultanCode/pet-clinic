package com.springframework.petclinic.controllers;

import com.springframework.petclinic.services.VetService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class VetController {
    private final VetService vetService;

    @GetMapping({"/vets","/vets/index"})
    public String getVetIndexPage(Model model){
        model.addAttribute("vets", vetService.findAllVets());
        return "vets/index";
    }
}
