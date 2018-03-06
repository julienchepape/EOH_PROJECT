package com.eoh.assignment.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "entity")
public class Entity implements Serializable {
	
	private long entityId;
	private String entityName;
	private String emailAddress;
	private Set<CIC> cicRecord;
	
	

	public Entity() {
		super();
	}
	public long getEntityId() {
		return entityId;
	}
	 @XmlElement
	public void setEntityId(long entityId) {
		this.entityId = entityId;
	}
	public String getEntityName() {
		return entityName;
	}
	 @XmlElement
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	 @XmlElement
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public Set<CIC> getCicRecord() {
		return cicRecord;
	}
	 @XmlElement
	public void setCicRecord(Set<CIC> cicRecord) {
		this.cicRecord = cicRecord;
	}
	
	
	

}
