package fr.teddy.springpetclinic.services.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fr.teddy.springpetclinic.model.Owner;

class OwnerMapServiceTest {

	OwnerMapService ownerMapService;
	private final Long OWNER_ID = 1L;
	private final String OWNER_NAME = "Dupont";

	@BeforeEach
	void setUp() throws Exception {
		ownerMapService = new OwnerMapService();
		Owner savedOwner = new Owner();
		savedOwner.setId(OWNER_ID);
		savedOwner.setLastName(OWNER_NAME);
		ownerMapService.save(savedOwner);
	}

	@Test
	void shouldFindOneOwner() {
		assertEquals(1, ownerMapService.findAll().size());
	}

	@Test
	void shouldFindTheSameId() {
		assertEquals(OWNER_ID, ownerMapService.findById(OWNER_ID).getId());
	}

	@Test
	void shouldFindTwoOwners() {
		Owner secondOwner = new Owner();
		secondOwner.setId(2L);
		ownerMapService.save(secondOwner);
		assertEquals(2, ownerMapService.findAll().size());
	}

	@Test
	void shouldGenerateIdForSecondOwnerInMap() {
		Owner secondOwner = new Owner();
		assertEquals(2L, ownerMapService.save(secondOwner).getId());
	}

	@Test
	void shouldFindZeroOwnerIfTheOnlyOneIsDeleted() {
		Owner ownerToBeDeleted = ownerMapService.findById(OWNER_ID);
		ownerMapService.delete(ownerToBeDeleted);
		assertEquals(0, ownerMapService.findAll().size());
	}

	@Test
	void shouldFindZeroOwnerIfTheOnlyOneIsDeletedById() {
		ownerMapService.deleteById(OWNER_ID);
		assertEquals(0, ownerMapService.findAll().size());
	}

	@Test
	void shouldReturnOwnerFoundByLastName() {
		assertEquals(OWNER_ID, ownerMapService.findByLastName(OWNER_NAME).getId());
	}
	
	@Test
	void shouldReturnNullIfNotFoundByLastName() {
		assertNull(ownerMapService.findByLastName("no_name"));
	}
}
