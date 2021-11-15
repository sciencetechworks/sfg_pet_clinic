/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.services.SpecialitiesService;
import java.util.Set;

/**
 *
 * @author Usuario
 */

public class SpecialityMapService extends AbstractMapService<Speciality, Long> 
implements SpecialitiesService{
  @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }
    
    @Override 
    public Speciality findById(Long id)
    {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void delete(Speciality object){
        super.delete(object);
    }
    
    @Override
    public void deleteById(Long id)
    {
        super.deleteById(id);
    }  
}
