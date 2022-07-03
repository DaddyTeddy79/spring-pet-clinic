package fr.teddy.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.teddy.springpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
