package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Usuario
 */
public interface OwnerRepository extends CrudRepository<Owner,Long> {
    
    Owner findByLastName(String lastName);
}
