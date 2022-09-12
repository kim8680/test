package com.calculator.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="calcs")
public class Calculator{
	
	

	@Id
	@Column(name="Id", length=10, nullable=false)
	private long id;
	
	@Column(name="name", length=44, nullable=false)
	private String name;
	
	@Column(name="duedate", length=44, nullable=false)
	private String duedate;
	
	@Column(name="startdate", length=44, nullable=false)
	private String startdate;
	
	@Column(name="priority", length=10, nullable=false)
	private long priority;
	
	@Column(name="status", length=44)
	private String status;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDuedate() {
		return duedate;
	}
	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public long getPriority() {
		return priority;
	}
	public void setPriority(long priority) {
		this.priority = priority;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
