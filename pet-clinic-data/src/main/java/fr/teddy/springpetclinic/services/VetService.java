package fr.teddy.springpetclinic.services;

import java.util.Set;

import fr.teddy.springpetclinic.model.Vet;

public interface VetService {

	Vet findById(Long id);

	Vet save(Vet vet);

	Set<Vet> findAll();

}
