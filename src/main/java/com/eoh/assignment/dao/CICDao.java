package com.eoh.assignment.dao;

import java.util.List;

import com.eoh.assignment.domain.CIC;
import com.eoh.assignment.domain.Entity;

public interface CICDao {

	/**
	 * This method retieves CIC record for a matching cicId passed.
	 * 
	 * @param cidId
	 *            the cidId parameter
	 * @return returns CIC object
	 */
	CIC retrieveCicInfo(long cidId);
}
