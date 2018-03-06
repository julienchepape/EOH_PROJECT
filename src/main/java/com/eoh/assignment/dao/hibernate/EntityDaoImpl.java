package com.eoh.assignment.dao.hibernate;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.eoh.assignment.dao.EntityDao;
import com.eoh.assignment.domain.Entity;
import com.eoh.assignment.util.SessionFactoryHelper;

public class EntityDaoImpl implements EntityDao {

	private static final Logger LOGGER = Logger.getLogger(EntityDaoImpl.class);

	/**
	 * This method records an entity.
	 * 
	 * @param entity
	 *            the entity domain object
	 */
	public void recordEntity(Entity entity) {

		SessionFactory factory = SessionFactoryHelper.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(entity);
		tx.commit();
		session.close();

		LOGGER.info("Object saved successfully");

	}

}
