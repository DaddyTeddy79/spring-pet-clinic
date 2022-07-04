package fr.teddy.springpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.teddy.springpetclinic.model.Vet;
import fr.teddy.springpetclinic.repositories.VetRepository;
import fr.teddy.springpetclinic.services.VetService;

@Service
@Profile("SDJPA")
public class VetSDJPAService extends AbstractSDJPAService<Vet, VetRepository> implements VetService {

	public VetSDJPAService(VetRepository vetRepository) {
		super(vetRepository);
	}
}
