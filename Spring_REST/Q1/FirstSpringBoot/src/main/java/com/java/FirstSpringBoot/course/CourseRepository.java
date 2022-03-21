package com.java.FirstSpringBoot.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

//logic for every entity class common one like update and get.
public interface CourseRepository extends CrudRepository<Course, String> {
	//custom find method by name.
//	public List<Course> findByName(String name);
	public List<Course> findByTopicId(String Id);
	
	
}
