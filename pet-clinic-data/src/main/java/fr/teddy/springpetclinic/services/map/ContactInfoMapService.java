package fr.teddy.springpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import fr.teddy.springpetclinic.model.ContactInfo;
import fr.teddy.springpetclinic.services.ContactInfoService;

@Service
public class ContactInfoMapService extends AbstractMapService<ContactInfo, Long> implements ContactInfoService {

	@Override
	public Set<ContactInfo> findAll() {
		return super.findAll();
	}

	@Override
	public ContactInfo findById(Long id) {
		return super.findById(id);
	}

	@Override
	public ContactInfo save(ContactInfo object) {
		return super.save(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(ContactInfo object) {
		super.delete(object);
	}

}
