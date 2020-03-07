package com.webservice.curriculumwebservice.persistence;

import java.io.Serializable;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
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

}
