package fr.teddy.springpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import fr.teddy.springpetclinic.model.Owner;
import fr.teddy.springpetclinic.model.Pet;
import fr.teddy.springpetclinic.model.PetType;
import fr.teddy.springpetclinic.model.Vet;
import fr.teddy.springpetclinic.services.OwnerService;
import fr.teddy.springpetclinic.services.PetService;
import fr.teddy.springpetclinic.services.PetTypeService;
import fr.teddy.springpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetService petService;
	private final PetTypeService petTypeService;

	public DataLoader(OwnerService ownerService, VetService vetService, PetService petService,
			PetTypeService petTypeService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petService = petService;
		this.petTypeService = petTypeService;
	}

	@Override
	public void run(String... args) throws Exception {

		Owner owner1 = new Owner();
		owner1.setFirstName("Teddy");
		owner1.setLastName("Coudière");

		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setFirstName("Roland");
		owner2.setLastName("Malaprade");

		ownerService.save(owner2);

		System.out.println("Owners loaded...");

		Vet vet1 = new Vet();
		vet1.setFirstName("Robert");
		vet1.setLastName("Bamoul");

		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setFirstName("Clarisse");
		vet2.setLastName("Duchamp");

		vetService.save(vet2);

		System.out.println("Vets loaded...");

		PetType dog = new PetType();
		dog.setName("Dog");
		dog = petTypeService.save(dog);

		PetType cat = new PetType();
		cat.setName("Cat");
		cat = petTypeService.save(cat);

		System.out.println("Pet types loaded...");

		Pet pet1 = new Pet();
	}

}
