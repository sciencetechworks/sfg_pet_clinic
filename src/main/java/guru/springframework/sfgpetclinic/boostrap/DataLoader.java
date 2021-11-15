/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guru.springframework.sfgpetclinic.boostrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import guru.springframework.sfgpetclinic.services.VetService;
import java.time.LocalDate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import guru.springframework.sfgpetclinic.services.SpecialityService;

/**
 *
 * @author Usuario
 */

@Component
public class DataLoader implements CommandLineRunner {

    
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;

    //@Autowired by default

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }
  
    
    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();
        if (count==0){
            loadData();
        }
    }

    private void loadData() {
        PetType dog =new PetType();
        dog.setName("dog");
        PetType savedDogPetType= petTypeService.save(dog);

        PetType cat =new PetType();
        cat.setName("cat");
        PetType savedCatPetType= petTypeService.save(cat);        
        
        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology= specialityService.save(radiology);
        
        Speciality surgery = new Speciality();
        radiology.setDescription("Surgery");
        Speciality savedSurgery= specialityService.save(surgery);
        
        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality dentistryRadiology= specialityService.save(dentistry);
        
        Owner owner1= new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("123123123");
        
        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);
     
        ownerService.save(owner1);
        
        Owner owner2= new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("345 Harlington");
        owner2.setCity("New York");
        owner2.setTelephone("123123123");
        
        Pet fionasPet = new Pet();
        fionasPet.setPetType(savedCatPetType);
        fionasPet.setOwner(owner2);
        fionasPet.setBirthDate(LocalDate.now());
        fionasPet.setName("Just cat");
        owner2.getPets().add(fionasPet);
        
        ownerService.save(owner2);
        
        System.out.println("Loaded Owners.......");
        
        Vet vet1=new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.getSpecialities().add(savedRadiology);
        
        vetService.save(vet1);
        
        Vet vet2=new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vet2.getSpecialities().add(savedSurgery);       
        
        vetService.save(vet2);
        
        System.out.println("Loaded Vets.......");
    }
    
}
