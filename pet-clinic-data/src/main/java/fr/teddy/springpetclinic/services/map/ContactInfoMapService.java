package fr.teddy.springpetclinic.services.map;

import org.springframework.stereotype.Service;

import fr.teddy.springpetclinic.model.ContactInfo;
import fr.teddy.springpetclinic.services.ContactInfoService;

@Service
public class ContactInfoMapService extends AbstractMapService<ContactInfo> implements ContactInfoService {

}
