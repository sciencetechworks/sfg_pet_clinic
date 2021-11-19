package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;


/**
 *
 * @author Usuario
 */
public interface OwnerService extends CrudService<Owner,Long>{
    
    Owner findByLastName(String lastName);
    
}
