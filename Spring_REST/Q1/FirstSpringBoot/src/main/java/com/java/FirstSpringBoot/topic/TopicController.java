package com.java.FirstSpringBoot.topic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api")
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}
	@RequestMapping("/topics/{id}")
	public Optional<Topic> getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	@RequestMapping(value = "/topics" , method = RequestMethod.POST )
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	@RequestMapping(value = "/topics/{id}" , method = RequestMethod.PUT )
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicService.updateTopic(id, topic);
	}
	@RequestMapping(value = "/topics/{id}" , method = RequestMethod.DELETE)
	public void deleteTopic(@PathVariable String id) {
		 topicService.deleteTopic(id);
	}
}
