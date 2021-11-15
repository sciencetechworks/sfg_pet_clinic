/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Speciality;
import java.util.Set;
import guru.springframework.sfgpetclinic.services.SpecialityService;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> 
implements SpecialityService{
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
