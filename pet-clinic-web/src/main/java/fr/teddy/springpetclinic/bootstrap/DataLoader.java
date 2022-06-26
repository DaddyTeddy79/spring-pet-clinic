package fr.teddy.springpetclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import fr.teddy.springpetclinic.model.ContactInfo;
import fr.teddy.springpetclinic.model.Owner;
import fr.teddy.springpetclinic.model.Pet;
import fr.teddy.springpetclinic.model.PetType;
import fr.teddy.springpetclinic.model.Vet;
import fr.teddy.springpetclinic.services.ContactInfoService;
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
	private final ContactInfoService contactInfoService;

	public DataLoader(OwnerService ownerService, VetService vetService, PetService petService,
			PetTypeService petTypeService, ContactInfoService contactInfoService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petService = petService;
		this.petTypeService = petTypeService;
		this.contactInfoService = contactInfoService;
	}

	@Override
	public void run(String... args) throws Exception {

		ContactInfo infoTeddy = new ContactInfo();
		infoTeddy.setAddress("101 rue du Marais de Lomme");
		infoTeddy.setZipCode("59160");
		infoTeddy.setCity("Lille");
		infoTeddy.setTelephone("06.84.99.66.56");

		infoTeddy = contactInfoService.save(infoTeddy);

		ContactInfo infoRoland = new ContactInfo();
		infoRoland.setAddress("0 rue de Nulle Part");
		infoRoland.setZipCode("75000");
		infoRoland.setCity("Paris");
		infoRoland.setTelephone("07.87.34.22.77");

		infoRoland = contactInfoService.save(infoRoland);

		ContactInfo vetInfo = new ContactInfo();
		vetInfo.setAddress("476 rue des Animaux");
		vetInfo.setZipCode("45000");
		vetInfo.setCity("Orléans");
		vetInfo.setTelephone("09.09.09.09.09");

		vetInfo = contactInfoService.save(vetInfo);

		System.out.println("Contact Informations loaded...");

		Owner owner1 = new Owner();
		owner1.setFirstName("Teddy");
		owner1.setLastName("Coudière");
		owner1.setContactInfo(infoTeddy);

		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setFirstName("Roland");
		owner2.setLastName("Malaprade");
		owner2.setContactInfo(infoRoland);

		ownerService.save(owner2);

		System.out.println("Owners loaded...");

		PetType dog = new PetType();
		dog.setName("Dog");
		dog = petTypeService.save(dog);

		PetType cat = new PetType();
		cat.setName("Cat");
		cat = petTypeService.save(cat);

		System.out.println("Pet types loaded...");

		Pet pet1 = new Pet();
		pet1.setPetType(cat);
		pet1.setName("Kiki");
		pet1.setBirthDate(LocalDate.now());
		pet1.setOwner(owner1);
		owner1.getPets().add(pet1);

		petService.save(pet1);
		ownerService.save(owner1);

		Pet pet2 = new Pet();
		pet2.setPetType(dog);
		pet2.setName("Médor");
		pet2.setBirthDate(LocalDate.now());
		pet2.setOwner(owner2);
		owner2.getPets().add(pet2);

		petService.save(pet2);

		Pet pet3 = new Pet();
		pet3.setPetType(dog);
		pet3.setName("Pupuce");
		pet3.setBirthDate(LocalDate.now());
		pet3.setOwner(owner2);
		owner2.getPets().add(pet3);

		petService.save(pet3);
		ownerService.save(owner2);

		System.out.println("Pet loaded...");

		Vet vet1 = new Vet();
		vet1.setFirstName("Robert");
		vet1.setLastName("Bamoul");
		vet1.setContactInfo(vetInfo);

		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setFirstName("Clarisse");
		vet2.setLastName("Duchamp");
		vet2.setContactInfo(vetInfo);

		vetService.save(vet2);

		System.out.println("Vets loaded...");

	}

}
