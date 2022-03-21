package com.java.FirstSpringBoot.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.java.FirstSpringBoot.topic.Topic;

@Entity //Tells JPA to create table topic and columns for id, name, description.
public class Course {
	
	@Id //id as primary key
	private String id;
	private String name;
	private String description;
	
	//tying course to topic
	//many courses can be associated to a topic
	@ManyToOne
	private Topic topic;
	
	
	public Course() {}
	public Course(String id, String name, String description, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic = new Topic(topicId, "", "");
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
	
}
