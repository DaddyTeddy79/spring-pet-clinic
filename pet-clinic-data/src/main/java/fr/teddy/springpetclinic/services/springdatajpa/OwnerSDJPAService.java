package fr.teddy.springpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.teddy.springpetclinic.model.Owner;
import fr.teddy.springpetclinic.repositories.OwnerRepository;
import fr.teddy.springpetclinic.services.OwnerService;

@Service
@Profile("SDJPA")
public class OwnerSDJPAService extends AbstractSDJPAService<Owner, OwnerRepository> implements OwnerService {

	public OwnerSDJPAService(OwnerRepository ownerRepository) {
		super(ownerRepository);
	}

	@Override
	public Owner findByLastName(String lastName) {
		return getRepository().findByLastName(lastName);
	}

}
