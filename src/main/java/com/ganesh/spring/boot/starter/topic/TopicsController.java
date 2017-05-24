package com.ganesh.spring.boot.starter.topic;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {
	
	private static final Logger logger = LoggerFactory.getLogger(TopicsController.class);
	
	@Autowired
	private TopicsService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{topicId}")
	public Topic getTopic(@PathVariable("topicId") Long id){
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody Topic topic){
		logger.info("Request Body is ",topic);
		topicService.addTopic(topic);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}")
	public void updateTopic(@PathVariable Long topicId,@RequestBody Topic topic){
		logger.info("PUT Request Body is ",topic);
		topicService.updateTopic(topicId,topic);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}")
	public void deleteTopic(@PathVariable Long topicId){
		topicService.deleteTopic(topicId);
	}
}
