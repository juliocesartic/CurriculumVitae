package com.webservice.curriculumwebservice.persistence;

public class Skills {
	private Integer _id;
	private String name;
	private int percentage;
	
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

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	
	
	
	
}
