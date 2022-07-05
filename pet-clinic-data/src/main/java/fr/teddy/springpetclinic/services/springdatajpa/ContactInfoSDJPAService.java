package fr.teddy.springpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.teddy.springpetclinic.model.ContactInfo;
import fr.teddy.springpetclinic.repositories.ContactInfoRepository;
import fr.teddy.springpetclinic.services.ContactInfoService;

@Service
@Profile("SDJPA")
public class ContactInfoSDJPAService extends AbstractSDJPAService<ContactInfo, ContactInfoRepository>
		implements ContactInfoService {

	public ContactInfoSDJPAService(ContactInfoRepository repository) {
		super(repository);
	}

}
