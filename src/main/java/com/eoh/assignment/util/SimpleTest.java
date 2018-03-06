package com.eoh.assignment.util;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import com.eoh.assignement.service.CICService;
import com.eoh.assignment.domain.CIC;
import com.eoh.assignment.domain.Entity;


public class SimpleTest {

	private Client client;
	private String REST_SERVICE_URL = "http://localhost:8080/Julien_EOH_Project/rest/CICService/cic";

	public static void main(String[] args) {

		CICService cicService = new CICService();
		Entity entity = new Entity();
		entity.setEntityName("sanlam");
		entity.setEmailAddress("julien.sanlam.com");
		Set<CIC> cicRecord = new HashSet<CIC>();
		CIC cic = new CIC();
		cic.setCicType("email");
		cic.setBody("HI Julien, please be adviced that monday you coming at 8 am");
		cic.setSubject("Monday UAT");
		cicRecord.add(cic);

		CIC cic2 = new CIC();
		cic2.setCicType("email");
		cic2.setBody("HI Julien, take the dogs for a run");
		cic2.setSubject("Jog Reminder");
		cicRecord.add(cic2);

		entity.setCicRecord(cicRecord);
		// cicService.recordJSONCIC(entity);

		// get CIC
		/*
		 * CIC cicobject = cicService.retrieveCIC(2); System.out.println(
		 * "CICType " + cicobject.getCicType()); System.out.println(
		 * "CICSubject " + cicobject.getSubject()); System.out.println(
		 * "CICBody " + cicobject.getBody());
		 */

		// create rest client

		SimpleTest test = new SimpleTest();
		test.init();
		test.addCIC(entity);
		test.GetCIC();


	}

	private void init() {
		this.client = ClientBuilder.newClient();
	}

	private void addCIC(Entity entity) {

		client.target(REST_SERVICE_URL).request(MediaType.APPLICATION_XML).post(javax.ws.rs.client.Entity.xml(entity),
				String.class);
	}

	private void GetCIC() {
		CIC cic = new CIC();
		cic.setCicId(1);

		CIC cicreturned=client.target(REST_SERVICE_URL).path("/{userid}").resolveTemplate("userid", 1)
				.request(MediaType.APPLICATION_XML).get(CIC.class);
		
			System.out.println("CICType +"+cicreturned.getCicType());
		
		
		
	}
}