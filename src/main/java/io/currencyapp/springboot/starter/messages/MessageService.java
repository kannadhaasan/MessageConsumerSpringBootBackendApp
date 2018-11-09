package io.currencyapp.springboot.starter.messages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
		
	private List<Messages> topics = new ArrayList<>(Arrays.asList(
			new Messages("kannad435", "EUR", "INR", "1000", "200", "0.10", "Ireland", "7-NOV-2018 21:51:2"),
			new Messages("John875", "EUR", "USD", "500", "800", "0.8", "Sweedon", "5-JUN-2015 18:40:8"),
			new Messages("Patricia936", "CAD", "AUD", "1000", "200", "0.7", "Canada", "23-AUG-2016 20:45:5")
			
			));
	
	public List<Messages> getAllTopic(){
		return topics;
	}
	
	public Messages getTopic(String userId) {
		return topics.stream().filter(t -> t.getUserId().equals(userId)).findFirst().get();
	}

	public void addTopic(Messages topic) {
		topics.add(topic);
		
	}
}
