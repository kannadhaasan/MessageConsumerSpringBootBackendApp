package io.currencyapp.springboot.starter.messages;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class MessageController {
	
	@Autowired
	private MessageService topicService;
	
	@RequestMapping("/messages")
	public List<Messages> getAllTopics() {
		return topicService.getAllMessage();
	}

	@RequestMapping("/messages/{id}")
	public Messages getTopic(@PathVariable String id) {
		return topicService.getMessage(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/messages")
	public void addTopic(@RequestBody Messages topic) {
		topicService.addMessage(topic);
	}
}
