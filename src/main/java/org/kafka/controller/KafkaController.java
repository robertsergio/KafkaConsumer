package org.kafka.controller;

import org.kafka.model.Item;
import org.kafka.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

	public final String TOPIC = "topic1";
	public final String TOPIC2 = "topic2";
	
	private Gson jsonConverter;
	
	
	@Autowired
	public KafkaController(Gson jsonConverter) {
		this.jsonConverter = jsonConverter;
	}
	
	@KafkaListener(topics = TOPIC)
	public void consume(String message)
	{
		System.out.println(message);
		
		Message m = (Message)jsonConverter.fromJson(message, Message.class);
		
		System.out.println(m.toString());
	}
	
	@KafkaListener(topics = TOPIC2)
	public void consumeItem(String item)
	{
		System.out.println(item);
		
		Item i = (Item)jsonConverter.fromJson(item, Item.class);
		
		System.out.println(i.toString());
	}
}
