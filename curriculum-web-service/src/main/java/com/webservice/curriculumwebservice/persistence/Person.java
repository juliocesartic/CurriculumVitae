package com.webservice.curriculumwebservice.persistence;

import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@Document(collection = "Persons")
public class Person {
	
	@Id
	private ObjectId id; 
	private String name;
	private String avatar;
	private String address;
	private String profession;
	private String bio;
	@DBRef
	private List<Certificate> certificates;
	@DBRef
	private List<Education> education;
	@DBRef
	private List<Experience> experience;
	@DBRef
	private List<Skills> skills;
	@DBRef
	private List<Social> social;
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", avatar=" + avatar + ", address=" + address + ", profession="
				+ profession + ", bio=" + bio + ", certificates=" + certificates + ", education=" + education
				+ ", experience=" + experience + ", skills=" + skills + ", social=" + social + "]";
	}
	
	

}
