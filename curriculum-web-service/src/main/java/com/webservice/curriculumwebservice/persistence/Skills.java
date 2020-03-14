package com.webservice.curriculumwebservice.persistence;

public class Skills {
	private Integer _id;
	private String name;
	private String percentage;
	
	public Skills() {
		super();
	}

	public Integer get_id() {
		return _id;
	}

	public void set_id(Integer _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	
	
	
	
}
