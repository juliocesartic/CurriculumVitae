package com.webservice.curriculumwebservice.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.webservice.curriculumwebservice.persistence.Person;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {
	public Person findPersonByName(String name);
	public Person findPersonById(ObjectId id);
}
