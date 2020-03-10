package com.webservice.curriculumwebservice.repositories;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@DataMongoTest
class SkillsRepositoryTest {
	@Autowired
	SkillsRepository repository;

	@Test
	void testRepository() {
		assertTrue(repository.count() > 0);
	}


}
