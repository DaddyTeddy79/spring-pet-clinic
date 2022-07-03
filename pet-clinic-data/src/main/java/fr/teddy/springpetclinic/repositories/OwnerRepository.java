package fr.teddy.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.teddy.springpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
