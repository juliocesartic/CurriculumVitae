package com.webservice.curriculumwebservice.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.webservice.curriculumwebservice.persistence.Person;


@Repository
public interface PersonRepository extends MongoRepository<Person, String> {

}
