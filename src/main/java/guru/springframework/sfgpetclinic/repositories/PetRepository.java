package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Usuario
 */
public interface PetRepository extends CrudRepository<Pet,Long>{
    
}
