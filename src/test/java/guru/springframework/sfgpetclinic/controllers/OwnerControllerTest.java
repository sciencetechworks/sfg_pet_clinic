package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.OwnerService;
import java.util.HashSet;
import java.util.Set;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.ArgumentMatchers.anyLong;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 *
 * @author Usuario
 */
@ExtendWith(MockitoExtension.class)
public class OwnerControllerTest {
    
    @Mock
    OwnerService ownerService;
    
    @InjectMocks
    OwnerController controller;
    
    Set<Owner> owners;
    
    MockMvc mockMvc;
    
    public OwnerControllerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
     owners= new HashSet<>();
     owners.add(Owner.builder().id(1L).build());
     owners.add(Owner.builder().id(2L).build());
     
     mockMvc = MockMvcBuilders.
             standaloneSetup(controller).
             build();
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of listOwners method, of class OwnerController.
     */
    @Test
    public void testListOwners() throws Exception {
        System.out.println("listOwners");
        
        when(ownerService.findAll()).thenReturn(owners);
        
        mockMvc.perform(get("/owners")).
                andExpect(status().isOk()).
                andExpect(view().name("owners/index")).
                andExpect(model().attribute("owners", hasSize(2)));
    }

    
     @Test
    public void testListOwnersByIndex() throws Exception {
        System.out.println("listOwnersByIndex");
        
        when(ownerService.findAll()).thenReturn(owners);
        
        mockMvc.perform(get("/owners/index")).
                andExpect(status().isOk()).
                andExpect(view().name("owners/index")).
                andExpect(model().attribute("owners", hasSize(2)));
    }
    
    /**
     * Test of findOwners method, of class OwnerController.
     */
    @Test
    public void testFindOwners() throws Exception {
        System.out.println("findOwners");
        
        mockMvc.perform(get("/owners/find")).
                andExpect(status().isOk()).
                andExpect(view().name("notimplemented"));
        
        verifyZeroInteractions(ownerService);
    }
    
    @Test
    void displayOwner() throws Exception {
        when(ownerService.findById(anyLong())).thenReturn(Owner.builder().id(1L).build());
        
        mockMvc.perform(get("/owners/123")).
                andExpect(status().isOk()).
                andExpect(view().name("owners/ownerDetails")).
                andExpect(model().attribute("owner", hasProperty("id",is(1L))));
        
    }
}
