package com.eoh.assignment.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.Calendar;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "cic")
public class CIC implements Serializable {
	
	private long cicId;
	private String cicType;
	private String subject;
	private String body;
	private String sourceSystem;
	private Calendar timeStamp;
	
	
	public CIC() {
		super();
	}
	public long getCicId() {
		return cicId;
	}
	@XmlElement
	public void setCicId(long cicId) {
		this.cicId = cicId;
	}
	public String getCicType() {
		return cicType;
	}
	@XmlElement
	public void setCicType(String cicType) {
		this.cicType = cicType;
	}
	public String getSubject() {
		return subject;
	}
	@XmlElement
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	@XmlElement
	public void setBody(String body) {
		this.body = body;
	}
	public String getSourceSystem() {
		return sourceSystem;
	}
	@XmlElement
	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}
	public Calendar getTimeStamp() {
		return timeStamp;
	}
	@XmlElement
	public void setTimeStamp(Calendar timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	
	

}
