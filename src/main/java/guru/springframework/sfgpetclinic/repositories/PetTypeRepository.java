package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Usuario
 */
public interface PetTypeRepository extends CrudRepository<PetType,Long> {
    
}
