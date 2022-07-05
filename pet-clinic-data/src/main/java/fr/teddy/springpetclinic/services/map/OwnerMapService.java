package fr.teddy.springpetclinic.services.map;

import org.springframework.stereotype.Service;

import fr.teddy.springpetclinic.model.Owner;
import fr.teddy.springpetclinic.services.OwnerService;

@Service
public class OwnerMapService extends AbstractMapService<Owner> implements OwnerService {

	@Override
	public Owner findByLastName(String lastName) {
		return null;
	}

}
