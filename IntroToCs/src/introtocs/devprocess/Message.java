package introtocs.devprocess;

public class Message {
	
	private User user;
	
	private String content;
	
	/**
	 * Constructs a new Message
	 * 
	 * @param u the user
	 * @param m the message
	 */
	public Message(User u, String m) {
		this.user = u;
		this.content = m;
	}
	
	/**
	 * Get's the message
	 * 
	 * @return the message
	 */
	public String getMessage() {
		String message = this.content + " - by: " + this.user.getName() + "\n";
		return message;
	}

}
