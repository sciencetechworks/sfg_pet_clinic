package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Usuario
 */
public interface VetRepository extends CrudRepository<Vet,Long> {
    
}
