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
public class Vet extends Person {
    private Set<Speciality> specialities;

    /**
     * @return the specialities
     */
    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    /**
     * @param specialities the specialities to set
     */
    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
    
    
    
}
