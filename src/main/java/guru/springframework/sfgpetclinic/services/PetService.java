/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;
import java.util.Set;

/**
 *
 * @author Usuario
 */
public interface PetService {
    Pet findById(Long id);
    
    Pet save(Pet owner);
    
    Set<Pet> findAll();
}
