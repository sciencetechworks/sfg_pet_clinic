/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.PetService;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import java.util.Set;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long> 
        implements OwnerService{

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }
    
    
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }
    
    @Override 
    public Owner findById(Long id)
    {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {

        if (object!=null){
            if (object.getPets()!=null){
                object.getPets().forEach(pet->{
                 if (pet.getPetType()!=null){
                     if (pet.getPetType().getId()==null)
                     {
                         pet.setPetType(petTypeService.save(pet.getPetType()));
                     }
                 } else
                 {
                     throw new RuntimeException("PetType is required");
                 }
                 
                 if (pet.getId() == null){
                     Pet savedPet = petService.save(pet);
                     pet.setId(savedPet.getId());
                 }
                });
            }
            return super.save(object);    
        } else {
            return null;
        }
    }

    @Override
    public void delete(Owner object){
        super.delete(object);
    }
    
    @Override
    public void deleteById(Long id)
    {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    
}
