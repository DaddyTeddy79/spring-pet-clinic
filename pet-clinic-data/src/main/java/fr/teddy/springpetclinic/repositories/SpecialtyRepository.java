package fr.teddy.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.teddy.springpetclinic.model.Specialty;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {

}
