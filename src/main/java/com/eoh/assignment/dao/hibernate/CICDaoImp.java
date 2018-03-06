package com.eoh.assignment.dao.hibernate;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.eoh.assignment.dao.CICDao;
import com.eoh.assignment.domain.CIC;
import com.eoh.assignment.util.SessionFactoryHelper;

public class CICDaoImp implements CICDao {

	private static final Logger LOGGER = Logger.getLogger(CICDaoImp.class);

	/**
	 * This method retieves CIC record for a matching cicId passed.
	 * 
	 * @param cidId
	 *            the cidId parameter
	 * @return returns CIC object
	 */
	public CIC retrieveCicInfo(long cidId) {
		SessionFactory factory = SessionFactoryHelper.getSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		CIC cic = (CIC) session.get(CIC.class, cidId);
		session.getTransaction().commit();
		session.close();

		LOGGER.info("Done processing method to retrieve CIC");

		return cic;
	}

}
