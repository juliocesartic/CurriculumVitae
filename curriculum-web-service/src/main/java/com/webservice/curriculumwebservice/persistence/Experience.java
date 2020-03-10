package com.webservice.curriculumwebservice.persistence;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@Document(collection = "Experience")
public class Experience {
	private ObjectId _id;
	private String company;
	private String jobDescription;
	private String jobTitle;
	private Date startDate;
	private Date endDate;
	
}
