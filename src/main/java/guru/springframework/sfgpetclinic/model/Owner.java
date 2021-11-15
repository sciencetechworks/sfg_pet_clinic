/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guru.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 *
 * @author Usuario
 */
public class Owner extends Person {
    private Set<Pet> pets;

     /**
     * @return the pets
     */
    public Set<Pet> getPets() {
        return pets;
    }

    /**
     * @param pets the pets to set
     */
    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
   
    
}
