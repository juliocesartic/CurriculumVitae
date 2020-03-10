package com.webservice.curriculumwebservice.persistence;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@Document(collection = "Skills")
public class Skills {
	private ObjectId _id;
	private String name;
	private int percentage;
}
