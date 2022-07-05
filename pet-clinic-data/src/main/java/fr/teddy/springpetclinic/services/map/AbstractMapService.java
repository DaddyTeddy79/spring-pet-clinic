package fr.teddy.springpetclinic.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import fr.teddy.springpetclinic.model.BaseEntity;
import fr.teddy.springpetclinic.services.CRUDService;

public abstract class AbstractMapService<T extends BaseEntity> implements CRUDService<T, Long> {

	private Map<Long, T> map = new HashMap<>();

	public Map getMap() {
		return map;
	}

	public Set<T> findAll() {
		return new HashSet<>(map.values());
	}

	public T findById(Long id) {
		return map.get(id);
	}

	public T save(T object) {
		if (object != null) {
			if (object.getId() == null) {
				object.setId(getNextId());
			}

			map.put(object.getId(), object);
		} else {
			throw new NullPointerException("Object cannot be null");
		}

		return object;
	}

	public void deleteById(Long id) {
		map.remove(id);
	}

	public void delete(T object) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}

	private Long getNextId() {
		if (map.keySet().size() == 0)
			return 1L;
		return Collections.max(map.keySet()) + 1;
	}
}
