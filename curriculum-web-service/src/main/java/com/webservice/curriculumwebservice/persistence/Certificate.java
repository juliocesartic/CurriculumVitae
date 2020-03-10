package com.webservice.curriculumwebservice.persistence;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@Document(collection = "Certificates")
public class Certificate {
	
	@Id
	private ObjectId _id;
	private Date date;
	private String description;
	private String institution;
	
	@Override
	public String toString() {
		return "Certificate [id=" + _id + ", date=" + date + ", description=" + description
				+ ", institution=" + institution + "]";
	}
	
	

}
