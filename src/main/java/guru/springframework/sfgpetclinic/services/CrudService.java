/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 *
 * @author Usuario
 */
public interface CrudService<T,ID> {
    
    Set<T> findAll();
    
    T findById(ID id);
    
    T save(T object);
    
    void delete(T object);
    
    void deleteById(ID id);
}
