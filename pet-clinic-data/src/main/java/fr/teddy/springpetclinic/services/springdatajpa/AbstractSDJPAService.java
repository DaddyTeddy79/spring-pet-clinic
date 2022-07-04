package fr.teddy.springpetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;

import fr.teddy.springpetclinic.model.BaseEntity;
import fr.teddy.springpetclinic.services.CRUDService;

public abstract class AbstractSDJPAService<T extends BaseEntity, R extends CrudRepository<T, Long>>
		implements CRUDService<T, Long> {

	private final R repository;

	public AbstractSDJPAService(R repository) {
		this.repository = repository;
	}

	public R getRepository() {
		return repository;
	}

	@Override
	public Set<T> findAll() {
		Set<T> objects = new HashSet<T>();
		repository.findAll().forEach(objects::add);
		return objects;
	}

	@Override
	public T findById(Long id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public T save(T object) {
		return repository.save(object);
	}

	@Override
	public void delete(T object) {
		repository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

}
