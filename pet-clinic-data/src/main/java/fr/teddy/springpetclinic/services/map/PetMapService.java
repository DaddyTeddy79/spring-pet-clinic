package fr.teddy.springpetclinic.services.map;

import java.util.Set;

import fr.teddy.springpetclinic.model.Pet;
import fr.teddy.springpetclinic.services.CRUDService;

public class PetMapService extends AbstractMapService<Pet, Long> implements CRUDService<Pet, Long> {

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Pet save(Pet pet) {
		return super.save(pet.getId(), pet);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Pet pet) {
		super.delete(pet);
	}

}
