package introtocs.devprocess;

import java.util.ArrayList;

public class MessageBoard {
	
	private ArrayList<Message> messages;
	
	/**
	 * Constructs a new Message Board	 * 
	 */
	public MessageBoard() {
		this.messages = new ArrayList<Message>();
	}
	
	/**
	 * Post a new Message
	 * 
	 * @param m the message
	 */
	public void post(Message m) {
		this.messages.add(m);
	}
	
	/**
	 * Dispays all of the messages
	 * 
	 * @return all of the messages
	 */
	public String display() {
		String theMessages = "Welcome to the Message Board\n\n";
		
		for(int i = 0; i < messages.size(); i++) {
			theMessages = theMessages + this.messages.get(i).getMessage();
		}
		
		return theMessages;
	}

}
