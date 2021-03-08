package org.kafka.controller;

import org.kafka.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

	
	public final String TOPIC = "topic1";
	
	
	@KafkaListener(topics = TOPIC)
	public void consume(Message message)
	{
		System.out.println(message.toString());
	}
}
