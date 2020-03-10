package com.webservice.curriculumwebservice.persistence;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@Document(collection = "Social")
public class Social {
	private ObjectId _id;
	private String name;
	private String url;
}
