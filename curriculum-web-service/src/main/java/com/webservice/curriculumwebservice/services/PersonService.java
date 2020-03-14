package com.webservice.curriculumwebservice.services;

import java.util.List;

import com.webservice.curriculumwebservice.persistence.Person;

public interface PersonService {
	
	public List<Person> getAllPersons();
	
	public Person updatePerson(Person person);

	
}
