package com.webservice.curriculumwebservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservice.curriculumwebservice.persistence.Person;
import com.webservice.curriculumwebservice.repositories.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	PersonRepository repository;

	@Override
	public List<Person> getAllPersons() {
		return repository.findAll();
	}

	@Override
	public Person updatePerson(Person person) {
		person = repository.save(person);
		return person;
	}

	@Override
	public Optional<Person> getPersonById(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}




}
