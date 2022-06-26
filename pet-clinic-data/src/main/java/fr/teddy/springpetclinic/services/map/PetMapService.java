package fr.teddy.springpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import fr.teddy.springpetclinic.model.Pet;
import fr.teddy.springpetclinic.services.PetService;

@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {

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
		return super.save(pet);
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
