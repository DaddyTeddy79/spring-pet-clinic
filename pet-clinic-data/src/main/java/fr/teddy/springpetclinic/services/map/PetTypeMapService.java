package fr.teddy.springpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.teddy.springpetclinic.model.PetType;
import fr.teddy.springpetclinic.services.PetTypeService;

@Service
@Profile({ "map", "default" })
public class PetTypeMapService extends AbstractMapService<PetType> implements PetTypeService {

}
