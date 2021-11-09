/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;
import java.util.Set;

/**
 *
 * @author Usuario
 */
public interface OwnerService {
    
    Owner findByLastName(String lastName);
    
    Owner findById(Long id);
    
    Owner save(Owner owner);
    
    Set<Owner> findAll();
}
