package fr.teddy.springpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.teddy.springpetclinic.model.Specialty;
import fr.teddy.springpetclinic.services.SpecialtyService;

@Service
@Profile({ "map", "default" })
public class SpecialtyMapService extends AbstractMapService<Specialty> implements SpecialtyService {

}
