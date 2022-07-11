package fr.teddy.springpetclinic.services.springdatajpa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import fr.teddy.springpetclinic.model.Owner;
import fr.teddy.springpetclinic.repositories.OwnerRepository;

@ExtendWith(MockitoExtension.class)
class OwnerSDJPAServiceTest {
	
	private final String OWNER_NAME = "Dupont";
	
	@InjectMocks
	OwnerSDJPAService ownerSDJPAService;
	
	@Mock
	OwnerRepository ownerRepository;
	
	Owner createdOwner;
	
	@BeforeEach
	void setUp() {
		createdOwner = new Owner();
		createdOwner.setId(1L);
		createdOwner.setLastName(OWNER_NAME);
	}
	
	@Test
	void testFindByLastName() {
		
		when(ownerRepository.findByLastName(any())).thenReturn(createdOwner);
		
		Owner foundOwner = ownerSDJPAService.findByLastName(OWNER_NAME);
		
		assertEquals(OWNER_NAME, foundOwner.getLastName());
	}
	
	@Test
	void testFindAll() {
		
		Set<Owner> createdOwners = new HashSet<Owner>();
		createdOwners.add(new Owner());
		createdOwners.add(createdOwner);
		
		when(ownerRepository.findAll()).thenReturn(createdOwners);
		
		Set<Owner> foundOwners = ownerSDJPAService.findAll();
		
		assertNotNull(foundOwners);
		assertEquals(2, foundOwners.size());
		verify(ownerRepository).findAll();
	}

	@Test
	void testFindById() {
		when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(createdOwner));
		Owner foundOwner = ownerSDJPAService.findById(1L);
		assertNotNull(foundOwner);
		verify(ownerRepository).findById(anyLong());
	}
	
	@Test
	void testNotFindById() {
		when(ownerRepository.findById(anyLong())).thenReturn(Optional.empty());
		Owner foundOwner = ownerSDJPAService.findById(1L);
		assertNull(foundOwner);
		verify(ownerRepository).findById(anyLong());
	}
	
	@Test
	void testSave() {
		when(ownerRepository.save(any())).thenReturn(createdOwner);
		Owner savedOwner = ownerSDJPAService.save(createdOwner);
		assertNotNull(savedOwner);
		verify(ownerRepository).save(any());
	}
	
	@Test
	void testDeleteOwner() {
		ownerSDJPAService.delete(createdOwner);
		verify(ownerRepository).delete(any());
	}
	
	@Test
	void testDeleteById() {
		ownerSDJPAService.deleteById(createdOwner.getId());
		verify(ownerRepository).deleteById(anyLong());
	}
}
