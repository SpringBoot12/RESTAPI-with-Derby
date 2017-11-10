package com.restAPI.spring.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restAPI.spring.model.Topic;
import com.restAPI.spring.model.TopicRepository;

@Service
public class TopicService {
	@Autowired
	private TopicRepository repository;

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		repository.findAll().forEach(topics::add);
		return topics;

	}

	public Topic getTopic(String id) {
		return repository.findOne(id);
	}

	public void addNewTopic(Topic topic) {
		repository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		repository.save(topic);
	}

	public void deleteTopic(String id) {
		repository.delete(id);
	}

}
