package com.example.demo.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	   
	   
	   Topic t1 = new Topic(1, "Java", "This is about JAVA8");
	   Topic t2 = new Topic(2, "Spring Boot", "This is about Spring Boot");
	   Topic t3 = new Topic(3, "DSA", "This is about Data Structure and Algorithms");
	   
	   private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(t1,t2,t3));	   
	   
	   public List<Topic> getAllTopics(){
		   return topics;
	   }
	   
	   public Topic getSpecificTopic(int id) {
		   Topic topic = null;
			ArrayList<Topic> topics = (ArrayList<Topic>) this.getAllTopics();
			for(Topic currentTopic: topics) {
				if(currentTopic.getId() == id) {
					topic = currentTopic;
					break;
				}
			}
			return topic;
	   }

	    public void addTopic(Topic topic) {
		topics.add(topic);
	    }

		public void updateTopic(Topic topic, int id) {
			for(Topic currTopic : topics) {
				if(currTopic.getId()==id) {
					topics.remove(currTopic);
					topics.add(topic);
					break;
				}
			}
		}
	
		public void deleteTopic(int id) {
			topics.removeIf(t -> t.getId() == id);
		}
	   
}
