package fr.teddy.springpetclinic.services;

import java.util.Set;

import fr.teddy.springpetclinic.model.Pet;

public interface PetService {

	Pet findById(Long id);

	Pet save(Pet pet);

	Set<Pet> findAll();

}
