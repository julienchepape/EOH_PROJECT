package com.eoh.assignement.service;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.eoh.assignment.dao.CICDao;
import com.eoh.assignment.dao.EntityDao;
import com.eoh.assignment.dao.hibernate.CICDaoImp;
import com.eoh.assignment.dao.hibernate.EntityDaoImpl;
import com.eoh.assignment.domain.CIC;
import com.eoh.assignment.domain.Entity;

@Path("/CICService")
public class CICService {
	
	private static final Logger LOGGER = Logger.getLogger(CICService.class); 
	
	@POST()
	@Path("/cic")
	@Consumes(MediaType.APPLICATION_JSON)
	public void recordJSONCIC(Entity entity)
	{
		//add JSON Entity
		EntityDao daoImpl=new EntityDaoImpl();
		daoImpl.recordEntity(entity);
		

	}
	
	@POST
	@Path("/cic")
	@Consumes(MediaType.APPLICATION_XML)
	public void recordXMLCIC(Entity entity)
	{
	
		//add XML Entity
		EntityDao daoImpl=new EntityDaoImpl();
		daoImpl.recordEntity(entity);

	}
	
	@GET 
	@Path("/cic/{cidId}") 
	@Produces(MediaType.APPLICATION_JSON) 
	public CIC retrieveCICJson(@PathParam("cidId")long cicId)
	{
		CICDao cicDao=new CICDaoImp();
		return cicDao.retrieveCicInfo(cicId);
	}
	
	@GET 
	@Path("/cic/{cidId}") 
	@Produces(MediaType.APPLICATION_XML) 
	public CIC retrieveCICXML(@PathParam("cidId")long cicId)
	{
		CICDao cicDao=new CICDaoImp();
		return cicDao.retrieveCicInfo(cicId);
	}

}
