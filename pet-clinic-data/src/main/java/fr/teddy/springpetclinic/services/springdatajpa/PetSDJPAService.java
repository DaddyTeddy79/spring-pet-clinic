package fr.teddy.springpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.teddy.springpetclinic.model.Pet;
import fr.teddy.springpetclinic.repositories.PetRepository;
import fr.teddy.springpetclinic.services.PetService;

@Service
@Profile("SDJPA")
public class PetSDJPAService extends AbstractSDJPAService<Pet, PetRepository> implements PetService {

	public PetSDJPAService(PetRepository petRepository) {
		super(petRepository);
	}
}
