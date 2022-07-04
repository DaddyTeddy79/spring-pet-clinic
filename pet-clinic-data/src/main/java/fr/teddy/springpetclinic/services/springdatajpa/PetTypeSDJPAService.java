package fr.teddy.springpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.teddy.springpetclinic.model.PetType;
import fr.teddy.springpetclinic.repositories.PetTypeRepository;
import fr.teddy.springpetclinic.services.PetTypeService;

@Service
@Profile("SDJPA")
public class PetTypeSDJPAService extends AbstractSDJPAService<PetType, PetTypeRepository> implements PetTypeService {

	public PetTypeSDJPAService(PetTypeRepository petTypeRepository) {
		super(petTypeRepository);
	}

}
