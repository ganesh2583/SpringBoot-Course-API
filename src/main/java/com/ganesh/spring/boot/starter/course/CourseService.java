package com.ganesh.spring.boot.starter.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(Long topicId){
		List<Course> allTopics = new ArrayList<Course>();
		for (Course topic : courseRepository.findByTopicId(topicId)) {
			allTopics.add(topic);
		}
		return allTopics;
	}
	
	public Course getCourse(long id){
		return courseRepository.findOne(id);
	}
	
	public void addCourse(Course topic){
		courseRepository.save(topic);
	}
	
	public void updateCourse(Long id, Course topic){
		courseRepository.save(topic);
	}
	
	public void deleteCourse(Long id){
		courseRepository.delete(id);
	}
	
}
