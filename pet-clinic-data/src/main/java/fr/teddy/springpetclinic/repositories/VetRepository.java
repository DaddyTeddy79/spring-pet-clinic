package fr.teddy.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.teddy.springpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {

}
