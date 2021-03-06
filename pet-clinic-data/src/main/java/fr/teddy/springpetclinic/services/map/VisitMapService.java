package fr.teddy.springpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.teddy.springpetclinic.model.Visit;
import fr.teddy.springpetclinic.services.VisitService;

@Service
@Profile({ "map", "default" })
public class VisitMapService extends AbstractMapService<Visit> implements VisitService {

}
