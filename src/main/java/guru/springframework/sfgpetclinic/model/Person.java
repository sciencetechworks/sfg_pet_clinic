package guru.springframework.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Usuario
 */
@Setter
@Getter
@NoArgsConstructor
@MappedSuperclass
public class Person extends BaseEntity {
    @Column(name = "first_name")
    private String firstName;
    
    @Column(name = "second_name")
    private String lastName;

    public Person(Long id,String firstName, String lastName) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    
}
