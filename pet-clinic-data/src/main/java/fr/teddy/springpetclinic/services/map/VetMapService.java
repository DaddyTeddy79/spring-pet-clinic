package fr.teddy.springpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.teddy.springpetclinic.model.Vet;
import fr.teddy.springpetclinic.services.VetService;

@Service
@Profile({ "map", "default" })
public class VetMapService extends AbstractMapService<Vet> implements VetService {

}
