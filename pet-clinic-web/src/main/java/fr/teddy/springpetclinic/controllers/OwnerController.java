package fr.teddy.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fr.teddy.springpetclinic.model.Owner;
import fr.teddy.springpetclinic.services.OwnerService;

@Controller
@RequestMapping("/owners")
public class OwnerController {

	private final OwnerService ownerService;

	public OwnerController(OwnerService ownerService) {
		this.ownerService = ownerService;
	}

	@RequestMapping({ "", "/", "/index", "/index.html" })
	public String listOwners(Model model) {
		model.addAttribute("owners", ownerService.findAll());
		return "owners/index";
	}

	@RequestMapping("/find")
	public String findOwners() {
		return "not-implemented";
	}
	
	@GetMapping("/{ownerId}")
	public ModelAndView showOwner(@PathVariable String ownerId) {
		ModelAndView mav = new ModelAndView("/owners/ownerDetails");
		Owner foundOwner = ownerService.findById(Long.valueOf(ownerId));
		mav.addObject("owner", foundOwner);
		return mav;
	}
}
