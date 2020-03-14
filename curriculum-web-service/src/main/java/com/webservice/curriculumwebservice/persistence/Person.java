package com.webservice.curriculumwebservice.persistence;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Persons")
public class Person {

	@Id
	private int _id;
	private String name;
	private String avatar;
	private String address;
	private String profession;
	private String bio;
	private List<Certificate> certificates;
	private List<Education> education;
	private List<Experience> experience;
	private List<Skills> skills;
	private List<Social> social;

	public Person() {
		super();
	}

	

	public int get_id() {
		return _id;
	}



	public void set_id(int _id) {
		this._id = _id;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public List<Certificate> getCertificates() {
		return certificates;
	}

	public void setCertificates(List<Certificate> certificates) {
		this.certificates = certificates;
	}

	public List<Education> getEducation() {
		return education;
	}

	public void setEducation(List<Education> education) {
		this.education = education;
	}

	public List<Experience> getExperience() {
		return experience;
	}

	public void setExperience(List<Experience> experience) {
		this.experience = experience;
	}

	public List<Skills> getSkills() {
		return skills;
	}

	public void setSkills(List<Skills> skills) {
		this.skills = skills;
	}

	public List<Social> getSocial() {
		return social;
	}

	public void setSocial(List<Social> social) {
		this.social = social;
	}

	@Override
	public String toString() {
		return "Person [id=" + _id + ", name= " + name + ", avatar=" + avatar + ", address=" + address + ", profession="
				+ profession + ", bio=" + bio + ", certificates=" + certificates + ", education=" + education
				+ ", experience=" + experience + ", skills=" + skills + ", social=" + social + "]";
	}

}
