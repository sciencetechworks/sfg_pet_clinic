/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.VetService;
import java.util.Set;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> 
        implements VetService{

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }
    
    @Override 
    public Vet findById(Long id)
    {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Vet object){
        super.delete(object);
    }
    
    @Override
    public void deleteById(Long id)
    {
        super.deleteById(id);
    }
  
    
}
