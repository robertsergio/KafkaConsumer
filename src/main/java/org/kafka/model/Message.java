package org.kafka.model;

public class Message {

	private int id;
	private String message;
	private String obs;
	
	public Message()
	{
	}

	public Message(int id, String message, String obs) {
		super();
		this.id = id;
		this.message = message;
		this.obs = obs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", message=" + message + ", obs=" + obs + "]";
	}
	
}
