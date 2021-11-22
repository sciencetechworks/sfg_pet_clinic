package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.repositories.OwnerRepository;
import guru.springframework.sfgpetclinic.repositories.PetRepository;
import guru.springframework.sfgpetclinic.repositories.PetTypeRepository;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 *
 * @author Usuario
 */
@ExtendWith(MockitoExtension.class)
public class OwnerSDJpaServiceTest {
    @Mock
    OwnerRepository ownerRepository;
    
    @Mock
    PetRepository petRepository;

    @Mock
    PetTypeRepository petTypeRepository;
    
    @InjectMocks
    OwnerSDJpaService service;
    
    Owner returnOwner;
    
    
    public static final String LAST_NAME = "Smith";
    
    public OwnerSDJpaServiceTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        returnOwner=Owner.builder().id(1L).lastName(LAST_NAME).build();
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of findByLastName method, of class OwnerSDJpaService.
     */
    @Test
    public void testFindByLastName() {
        System.out.println("findByLastName");
        
        Owner returnOwner = Owner.builder().id(1L).lastName(LAST_NAME).build();
        
        when(ownerRepository.findByLastName(any())).thenReturn(returnOwner);
        
        Owner smith= service.findByLastName(LAST_NAME);
        
        assertEquals(LAST_NAME,smith.getLastName());
        
        verify(ownerRepository).findByLastName(any());
    }

    /**
     * Test of findAll method, of class OwnerSDJpaService.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        Set<Owner> returnOwnerSet = new HashSet<>();
        returnOwnerSet.add(Owner.builder().id(1L).build());
        returnOwnerSet.add(Owner.builder().id(2L).build());
        
        when(ownerRepository.findAll()).thenReturn(returnOwnerSet);
        
        Set<Owner> owners = service.findAll();
        
        assertNotNull(owners);
        assertEquals(2,owners.size());
    }

    /**
     * Test of findById method, of class OwnerSDJpaService.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        when(ownerRepository.findById(anyLong())).
                thenReturn(Optional.of(returnOwner));
        
        Owner owner = service.findById(1L);
        
        assertNotNull(owner);
    }
    
    /**
     * Test of findById method, of class OwnerSDJpaService.
     */
    @Test
    public void testFindByIdNotFound() {
        System.out.println("findByIdNotFound");
        when(ownerRepository.findById(anyLong())).
                thenReturn(Optional.empty());
        
        Owner owner = service.findById(1L);
        
        assertNull(owner);
    }

    /**
     * Test of save method, of class OwnerSDJpaService.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Owner ownerToSave = Owner.builder().id(1L).build();
        
        when(ownerRepository.save(any())).thenReturn(returnOwner);
        
        Owner savedOwner = service.save(ownerToSave);
        
        assertNotNull(savedOwner);
        
        verify(ownerRepository).save(any());
    }

    /**
     * Test of delete method, of class OwnerSDJpaService.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        service.delete(returnOwner);
        
        verify(ownerRepository,times(1)).delete(any());
    }

    /**
     * Test of deleteById method, of class OwnerSDJpaService.
     */
    @Test
    public void testDeleteById() {
        System.out.println("deleteById");
        service.deleteById(1L);
        
        verify(ownerRepository).deleteById(any());
    }
    
}
