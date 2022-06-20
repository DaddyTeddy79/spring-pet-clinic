package fr.teddy.springpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import fr.teddy.springpetclinic.model.Owner;
import fr.teddy.springpetclinic.model.Vet;
import fr.teddy.springpetclinic.services.OwnerService;
import fr.teddy.springpetclinic.services.VetService;
import fr.teddy.springpetclinic.services.map.OwnerMapService;
import fr.teddy.springpetclinic.services.map.VetMapService;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;

	public DataLoader() {
		ownerService = new OwnerMapService();
		vetService = new VetMapService();
	}

	@Override
	public void run(String... args) throws Exception {

		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Teddy");
		owner1.setLastName("Coudière");

		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFirstName("Roland");
		owner2.setLastName("Malaprade");

		ownerService.save(owner2);

		System.out.println("Owners loaded...");

		Vet vet1 = new Vet();
		vet1.setId(1L);
		vet1.setFirstName("Robert");
		vet1.setLastName("Bamoul");

		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setId(2L);
		vet2.setFirstName("Clarisse");
		vet2.setLastName("Duchamp");

		vetService.save(vet2);

		System.out.println("Vets loaded...");
	}

}
