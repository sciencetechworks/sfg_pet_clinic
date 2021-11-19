package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Usuario
 */
public interface SpecialityRepository extends CrudRepository<Speciality,Long> {
    
}
