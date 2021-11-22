/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.PetService;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class OwnerMapServiceTest {
    OwnerMapService ownerMapService;
    final Long ownerId = 1L;
    public OwnerMapServiceTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        ownerMapService = new OwnerMapService(
            new PetTypeMapService(),new PetMapService());
        
        ownerMapService.save(Owner.builder().id(ownerId).lastName("Smith").build());
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of findAll method, of class OwnerMapService.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        OwnerMapService instance = ownerMapService;
        Long expResult = ownerId;
        Set<Owner> result = instance.findAll();
        assertEquals(expResult, result.size());
    }

    /**
     * Test of findById method, of class OwnerMapService.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        Long id = ownerId;
        OwnerMapService instance = ownerMapService;
        Long expResult = ownerId;
        Owner result = instance.findById(id);
        assertEquals(expResult, result.getId());
    }

    /**
     * Test of save method, of class OwnerMapService.
     */
    @Test
    public void testSaveExistingId() {
        System.out.println("testSaveExistingId");
        Long id=2L;
        System.out.println("save");
        Owner owner2=Owner.builder().id(id).build();
        Owner savedOwner = ownerMapService.save(owner2);
        assertEquals(id,savedOwner.getId());
    }
    
    /**
     * Test of save method, of class OwnerMapService.
     */
    @Test
    public void testSaveNoId() {
        System.out.println("testSaveNoId");
        
        Owner savedOwner = ownerMapService.save(Owner.builder().lastName("Smith").build());
        assertNotNull(savedOwner);
        assertNotNull(savedOwner.getId());
    }

    /**
     * Test of delete method, of class OwnerMapService.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Owner object = ownerMapService.findById(ownerId);
        OwnerMapService instance = ownerMapService;
        instance.delete(object);
        assertEquals(0,ownerMapService.findAll().size());
    }

    /**
     * Test of deleteById method, of class OwnerMapService.
     */
    @Test
    public void testDeleteById() {
        System.out.println("deleteById");
        Long id = ownerId;
        OwnerMapService instance = ownerMapService;
        instance.deleteById(id);
        assertEquals(0,ownerMapService.findAll().size());
    }

    /**
     * Test of findByLastName method, of class OwnerMapService.
     */
    @Test
    public void testFindByLastName() {
        System.out.println("findByLastName");
        String lastName = "Smith";
        OwnerMapService instance = ownerMapService;
        String expResult = "Smith";
        Owner result = instance.findByLastName(lastName);
        assertNotNull(result);
        assertEquals(ownerId,result.getId());
        assertEquals(result.getLastName(),expResult);
    }
    
    @Test
    public void testFindByLastNameNotFound() {
        System.out.println("findByLastNameNotFound");
        String lastName = "Dubiduh";
        OwnerMapService instance = ownerMapService;
        Owner result = instance.findByLastName(lastName);
        assertNull(result);
        
    }
    
}
