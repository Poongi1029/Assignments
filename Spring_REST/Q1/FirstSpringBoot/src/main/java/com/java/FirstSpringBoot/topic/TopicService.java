package com.java.FirstSpringBoot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	//injecting instance of TopicRepository.
	private TopicRepository topicRepository;
	
	
	//mutable
//	private List <Topic> topics = new ArrayList<Topic>(Arrays.asList(
//			new Topic("spring", "Spring Freamework", "Spring Framework Description"),
//			new Topic("java", "Core Java", "Core Java Description"),
//			new Topic("javascript", "JavaScript", "JavaScript Description")
//			));
	
	public List<Topic> getAllTopics(){
//		return topics;
		//creating list and iterating findall.
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics::add);
		return topics;
	}
	
	public Optional<Topic> getTopic(String id) {
//		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepository.findById(id);
	
	}
	
	public void addTopic(Topic topic) {
//		topics.add(topic);
		topicRepository.save(topic);
		
	}
	
	public void updateTopic(String id, Topic topic) {
//		for(int i =0; i<topics.size(); i++) {
//			Topic t = topics.get(i);
//			if(t.getId().equals(id)) {
//				topics.set(i, topic);
//				return;
//			}
//		}
		//save can do both add and update.
		topicRepository.save(topic); 
		
	}

	public void deleteTopic(String id) {
//		topics.removeIf(t -> t.getId().equals(id));
		topicRepository.deleteById(id);
	}

}
