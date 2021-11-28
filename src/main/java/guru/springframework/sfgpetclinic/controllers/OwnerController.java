package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Usuario
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {
      
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }
    
    
    @RequestMapping({"","/","/index","/index.html"})
    public String listOwners(Model model){
        
        model.addAttribute("owners", ownerService.findAll());
        
        return "owners/index";
    }
    
    @RequestMapping("/find")
    public String findOwners(Model model){
        
        return "notimplemented";
    }
    
    /**
	 * Custom handler for displaying an owner.
	 * @param ownerId the ID of the owner to display
	 * @return a ModelMap with the model attributes for the view
	 */
	@GetMapping("/{ownerId}")
	public ModelAndView showOwner(@PathVariable("ownerId") Long ownerId) {
		ModelAndView mav = new ModelAndView("owners/ownerDetails");
		Owner owner = ownerService.findById(ownerId);
		mav.addObject(owner);
		return mav;
	}
}
