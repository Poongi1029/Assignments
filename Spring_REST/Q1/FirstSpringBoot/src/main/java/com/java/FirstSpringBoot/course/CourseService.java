package com.java.FirstSpringBoot.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	//injecting instance of TopicRepository.
	private CourseRepository courseRepository;
	
	
	//mutable
//	private List <Topic> topics = new ArrayList<Topic>(Arrays.asList(
//			new Topic("spring", "Spring Freamework", "Spring Framework Description"),
//			new Topic("java", "Core Java", "Core Java Description"),
//			new Topic("javascript", "JavaScript", "JavaScript Description")
//			));
	
	public List<Course> getAllCourses(String topicId){
//		return topics;
		//creating list and iterating findall.
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId)
		.forEach(courses::add);
		return courses;
	}
	
	public Optional<Course> getCourse(String id) {
//		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return courseRepository.findById(id);
	
	}
	
	public void addCourse(Course course) {
//		topics.add(topic);
		courseRepository.save(course);
		
	}
	
	public void updateCourse(Course course) {
//		for(int i =0; i<topics.size(); i++) {
//			Topic t = topics.get(i);
//			if(t.getId().equals(id)) {
//				topics.set(i, topic);
//				return;
//			}
//		}
		//save can do both add and update.
		courseRepository.save(course); 
		
	}

	public void deleteCourse(String id) {
//		topics.removeIf(t -> t.getId().equals(id));
		courseRepository.deleteById(id);
	}

}
