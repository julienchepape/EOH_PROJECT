package com.eoh.assignment.dao;

import com.eoh.assignment.domain.Entity;

public interface EntityDao {

	/**
	 * This method records an entity.
	 * 
	 * @param entity
	 *            the entity domain object
	 */
	void recordEntity(Entity entity);

}
