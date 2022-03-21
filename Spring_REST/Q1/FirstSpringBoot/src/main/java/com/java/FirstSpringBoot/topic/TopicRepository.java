package com.java.FirstSpringBoot.topic;

import org.springframework.data.repository.CrudRepository;

//logic for every entity class common one like update and get.
public interface TopicRepository extends CrudRepository<Topic, String> {
	
	
	
}
