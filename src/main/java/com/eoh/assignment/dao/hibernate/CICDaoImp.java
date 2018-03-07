package com.eoh.assignment.dao.hibernate;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

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

		Transaction transaction = null;
		Session session = null;
		CIC cic = null;
		try {
			SessionFactory factory = SessionFactoryHelper.getSessionFactory();
			session = factory.openSession();
			transaction = session.beginTransaction();
			Criteria criteria = session.createCriteria(CIC.class);
			criteria.add(Restrictions.eq("CicId", cidId));
			cic = (CIC) criteria.uniqueResult();
			transaction.commit();
		} catch (HibernateException e) {

			session.getTransaction().rollback();
			LOGGER.error(e.getMessage());

		} finally {
			session.close();
		}
		LOGGER.info("Done processing method to retrieve CIC");

		return cic;
	}

}
