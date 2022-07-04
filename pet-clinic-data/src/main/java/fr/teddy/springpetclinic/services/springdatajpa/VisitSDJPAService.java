package fr.teddy.springpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.teddy.springpetclinic.model.Visit;
import fr.teddy.springpetclinic.repositories.VisitRepository;
import fr.teddy.springpetclinic.services.VisitService;

@Service
@Profile("SDJPA")
public class VisitSDJPAService extends AbstractSDJPAService<Visit, VisitRepository> implements VisitService {

	public VisitSDJPAService(VisitRepository visitRepository) {
		super(visitRepository);
	}

}
