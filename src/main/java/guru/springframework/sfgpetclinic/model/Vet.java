/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guru.springframework.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Usuario
 */
@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@Table(name="vets")
public class Vet extends Person {
    
    @ManyToMany(fetch= FetchType.EAGER)
    @JoinTable(name="vet_specialties",
            joinColumns= @JoinColumn(name="vet_id"),
            inverseJoinColumns=@JoinColumn(name="specialty_id"))
    private final Set<Speciality> specialities= new HashSet<>();


}
