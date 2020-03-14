package com.webservice.curriculumwebservice.controllers;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.curriculumwebservice.persistence.Person;
import com.webservice.curriculumwebservice.services.PersonService;

@RestController
@RequestMapping(value= "/v1/curriculum")
public class PersonController {
	
	@Autowired
	PersonService personService;
	
	@GetMapping(path = "/persons")
	public List<Person> getAllPersons() {

		return personService.getAllPersons();

	}
	
	@GetMapping(path = "/person")
	public Optional<Person>getPerson() {

		return personService.getPersonById(1);

	}
	

	
	


}
