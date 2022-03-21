package com.java.FirstSpringBoot.course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.FirstSpringBoot.topic.Topic;

@RestController
//@RequestMapping("/api")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllTopics(@PathVariable String id) {
		return courseService.getAllCourses(id);
	}
	@RequestMapping("/topics/{topicId}/courses/{id}")
	public Optional<Course> getTopic(@PathVariable String id) {
		return courseService.getCourse(id);
	}
	@RequestMapping(value = "/topics/{topicId}/courses" , method = RequestMethod.POST )
	public void addTopic(@RequestBody Course course, @PathVariable String topicId) {
		course.setTopic(new Topic(topicId,"",""));
		courseService.addCourse(course);
	}
	@RequestMapping(value = "/topics/{topicId}/courses/{id}" , method = RequestMethod.PUT )
	public void updateTopic(@RequestBody Course course, @PathVariable String topicId, @PathVariable String id) {
		course.setTopic(new Topic(topicId,"",""));
		courseService.updateCourse(course);
	}
	@RequestMapping(value = "/topics/{topicId}/courses/{id}" , method = RequestMethod.DELETE)
	public void deleteTopic(@PathVariable String id) {
		courseService.deleteCourse(id);
	}
}
