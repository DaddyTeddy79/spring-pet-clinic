package fr.teddy.springpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.teddy.springpetclinic.model.Specialty;
import fr.teddy.springpetclinic.repositories.SpecialtyRepository;
import fr.teddy.springpetclinic.services.SpecialtyService;

@Service
@Profile("SDJPA")
public class SpecialtySDJPAService extends AbstractSDJPAService<Specialty, SpecialtyRepository>
		implements SpecialtyService {

	public SpecialtySDJPAService(SpecialtyRepository specialtyRepository) {
		super(specialtyRepository);
	}

}
