package com.webservice.curriculumwebservice.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.webservice.curriculumwebservice.persistence.Person;
import com.webservice.curriculumwebservice.persistence.Social;

@Repository
public interface SocialRepository extends MongoRepository<Social, String>{}
