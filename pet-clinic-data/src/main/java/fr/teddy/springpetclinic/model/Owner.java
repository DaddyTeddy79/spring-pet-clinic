package fr.teddy.springpetclinic.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Owner extends Person {

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
	private Set<Pet> pets = new HashSet<>();

	public Set<Pet> getPets() {
		return pets;
	}

	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}

}
