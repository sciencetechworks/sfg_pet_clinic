/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class Pet extends BaseEntity {
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    /**
     * @return the petType
     */
    public PetType getPetType() {
        return petType;
    }

    /**
     * @param petType the petType to set
     */
    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    /**
     * @return the owner
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * @return the birthDate
     */
    public LocalDate getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
