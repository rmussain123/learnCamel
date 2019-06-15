package io.javabrains.springbootstarter.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("Spring","Spring Framework","Spring Framework description"),
				new Topic("Java","Core Java","Core Java Description"),
				new Topic("Java Script","Java Script","Java Script Description")
				); 
	}
	
}
