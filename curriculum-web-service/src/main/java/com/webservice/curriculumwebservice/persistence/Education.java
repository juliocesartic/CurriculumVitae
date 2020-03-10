package com.webservice.curriculumwebservice.persistence;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@Document(collection = "Education")
public class Education {
	
	private ObjectId _id;
	private String degree;
	private String description;
	private String institution;
	private Date endDate;

}
