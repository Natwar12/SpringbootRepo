package com.example.demo.topics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	private List<Topic> getTopics() {
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{topicId}")
	private Topic getTopic(@PathVariable("topicId") int id) {
		return topicService.getSpecificTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics" )
	private void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic); 
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{topicId}" )
	private void updateTopic(@RequestBody Topic topic, @PathVariable("topicId") int id) {
		topicService.updateTopic(topic, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{topicId}" )
	private void deleteTopic(@PathVariable("topicId") int id) {
		topicService.deleteTopic(id);
	}
	
}
