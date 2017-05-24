package com.ganesh.spring.boot.starter.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicsService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getAllTopics(){
		List<Topic> allTopics = new ArrayList<Topic>();
		for (Topic topic : topicRepository.findAll()) {
			allTopics.add(topic);
		}
		return allTopics;
	}
	
	public Topic getTopic(long id){
		return topicRepository.findOne(id);
	}
	
	public void addTopic(Topic topic){
		topicRepository.save(topic);
	}
	
	public void updateTopic(Long id, Topic topic){
		topicRepository.save(topic);
	}
	
	public void deleteTopic(Long id){
		topicRepository.delete(id);
	}
	
}
