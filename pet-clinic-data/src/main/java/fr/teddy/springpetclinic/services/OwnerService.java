package fr.teddy.springpetclinic.services;

import fr.teddy.springpetclinic.model.Owner;

public interface OwnerService extends CRUDService<Owner, Long> {

	Owner findByLastName(String lastName);

}
