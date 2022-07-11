package fr.teddy.springpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.teddy.springpetclinic.model.Owner;
import fr.teddy.springpetclinic.services.OwnerService;

@Service
@Profile({ "map", "default" })
public class OwnerMapService extends AbstractMapService<Owner> implements OwnerService {

	@Override
	public Owner findByLastName(String lastName) {

		return this.findAll()
				.stream()
				.filter(owner -> owner.getLastName().equalsIgnoreCase(lastName))
				.findFirst()
				.orElse(null);

		/*
		 * This is my first version Owner foundOwner = null; for (Owner currentOwner :
		 * findAll()) { if (currentOwner.getLastName() == lastName) { foundOwner =
		 * currentOwner; break; } } return foundOwner;
		 */
	}

}
