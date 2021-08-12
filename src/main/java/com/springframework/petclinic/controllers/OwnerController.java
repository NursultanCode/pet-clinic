package com.springframework.petclinic.controllers;

import com.springframework.petclinic.services.OwnerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class OwnerController {

    @Autowired
    private final OwnerService ownerService;

    @GetMapping({"/owners","/owners/index"})
    public String getOwnersIndexPage(Model model){
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
}
