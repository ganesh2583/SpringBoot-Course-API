package com.ganesh.spring.boot.starter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long>{
	
	public List<Course> findByTopicId(Long topicId);

}
