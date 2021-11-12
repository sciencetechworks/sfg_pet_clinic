/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Usuario
 */
@Controller
public class VetController {
      
    private VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }
    
    
    
    @RequestMapping({"/vets","vets/index","vets/index.html"})
    public String listVets(Model model){
        
        model.addAttribute("vets",vetService.findAll());
        
        return "vets/index";
    }
}
