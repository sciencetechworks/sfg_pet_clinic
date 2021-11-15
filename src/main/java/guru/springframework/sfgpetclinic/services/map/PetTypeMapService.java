/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import java.util.Set;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class PetTypeMapService extends AbstractMapService<PetType,Long> 
        implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }
    
    @Override 
    public PetType findById(Long id)
    {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType object){
        super.delete(object);
    }
    
    @Override
    public void deleteById(Long id)
    {
        super.deleteById(id);
    }
}
