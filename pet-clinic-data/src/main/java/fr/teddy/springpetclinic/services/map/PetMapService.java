package fr.teddy.springpetclinic.services.map;

import org.springframework.stereotype.Service;

import fr.teddy.springpetclinic.model.Pet;
import fr.teddy.springpetclinic.services.PetService;

@Service
public class PetMapService extends AbstractMapService<Pet> implements PetService {

}
