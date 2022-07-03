package fr.teddy.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.teddy.springpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {

}
