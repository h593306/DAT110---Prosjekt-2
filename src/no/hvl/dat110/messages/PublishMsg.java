package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

public class PublishMsg extends Message {
	
	// message sent from client to create publish a message on a topic 

	// TODO:
	// Implement object variables - a topic and a message is required
	private String topic;
	private String message;
	// Constructor, get/set-methods, and toString method
	// as described in the project text
	public PublishMsg(String user, String topic, String message) {
		super(MessageType.PUBLISH, user);
		this.topic = topic;
		this.message = message;
	}
	
	
	public String getMessage() {
//		if (message != null) {
			return message;
//		} else 
//		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	 public String getTopic() {
	    	return topic;
	    }
	    
	    public void setTopic(String topic) {
	    	this.topic = topic;
	    }
	    
	    @Override
	    public String toString() {
	    	return "PublishMsg [topic=" + topic + "]";
	    }
}	
