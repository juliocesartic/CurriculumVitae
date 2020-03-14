package com.webservice.curriculumwebservice.controllers;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.curriculumwebservice.persistence.Person;
import com.webservice.curriculumwebservice.services.PersonService;

@RestController
@RequestMapping(value= "/v1/curriculum/persons")
public class PersonController {
	
	@Autowired
	PersonService personService;
	
	@GetMapping
	public List<Person> getAllPersons() {

		return personService.getAllPersons();

	}
	
	@PutMapping
	public Person updatePerson(Person person) {

		return personService.updatePerson(person);

	}
	
	


}
