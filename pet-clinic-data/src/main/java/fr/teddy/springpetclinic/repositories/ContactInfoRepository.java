package fr.teddy.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.teddy.springpetclinic.model.ContactInfo;

public interface ContactInfoRepository extends CrudRepository<ContactInfo, Long> {

}
