package com.webservice.curriculumwebservice.services;

import java.util.List;
import java.util.Optional;

import com.webservice.curriculumwebservice.persistence.Person;

public interface PersonService {
	
	public List<Person> getAllPersons();
	
	public Optional<Person> getPersonById(Integer id);
	
	public Person updatePerson(Person person);

	
}
