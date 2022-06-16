package fr.teddy.springpetclinic.services.map;

import java.util.Set;

import fr.teddy.springpetclinic.model.Owner;
import fr.teddy.springpetclinic.services.CRUDService;

public class OwnerMapService extends AbstractMapService<Owner, Long> implements CRUDService<Owner, Long> {

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Owner save(Owner owner) {
		return super.save(owner.getId(), owner);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Owner owner) {
		super.delete(owner);
	}

}