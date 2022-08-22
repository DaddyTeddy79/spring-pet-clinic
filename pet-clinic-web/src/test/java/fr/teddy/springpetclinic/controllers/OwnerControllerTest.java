package fr.teddy.springpetclinic.controllers;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import fr.teddy.springpetclinic.model.Owner;
import fr.teddy.springpetclinic.services.OwnerService;

@ExtendWith(MockitoExtension.class)
class OwnerControllerTest {
	
	@Mock
	OwnerService ownerService;
	
	@InjectMocks
	OwnerController ownerController;
	
	Set<Owner> owners;
	
	MockMvc mockMvc;

	@BeforeEach
	void setUp() throws Exception {
		
		owners = new HashSet<Owner>();
		Owner firstOwner = new Owner();
		firstOwner.setId(1L);
		owners.add(firstOwner);
		Owner secondOwner = new Owner();
		secondOwner.setId(2L);
		owners.add(secondOwner);
		
		mockMvc = MockMvcBuilders
				.standaloneSetup(ownerController)
				.build();
	}

	@Test
	void testListOwners() throws Exception {
		when(ownerService.findAll()).thenReturn(owners);
		mockMvc.perform(get("/owners"))
			.andExpect(status().isOk())
			.andExpect(view().name("owners/index"))
			.andExpect(model().attribute("owners", hasSize(2)));
	}

	@Test
	void testListOwnersByIndex() throws Exception {
		when(ownerService.findAll()).thenReturn(owners);
		mockMvc.perform(get("/owners/index"))
			.andExpect(status().isOk())
			.andExpect(view().name("owners/index"))
			.andExpect(model().attribute("owners", hasSize(2)));
	}
	
	@Test
	void testFindOwner() throws Exception {
		mockMvc.perform(get("/owners/find"))
			.andExpect(status().is2xxSuccessful())
			.andExpect(view().name("not-implemented"));
	}

	@Test
	void testShowOwner() throws Exception {
		// given
		Owner owner =  new Owner();
		owner.setId(4L);
		
		// when
		when(ownerService.findById(anyLong())).thenReturn(owner);
		
		// then
		mockMvc.perform(get("/owners/123"))
		.andExpect(status().isOk())
		.andExpect(view().name("/owners/ownerDetails"))
		.andExpect(model().attributeExists("owner"));
	}
}
