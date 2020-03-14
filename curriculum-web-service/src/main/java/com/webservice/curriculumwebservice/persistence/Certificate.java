package com.webservice.curriculumwebservice.persistence;


public class Certificate {
	
	private int _id;
	private String name;
	private String date;
	private String description;
	private String institution;
	
	
	public Certificate() {
		super();
	}

	@Override
	public String toString() {
		return "Certificate [id=" + _id + ", date=" + date + ", description=" + description
				+ ", institution=" + institution + "]";
	}
	
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}
	
	
	
	

}
