package introtocs.devprocess;

public class MessageBoardTester {

	public static void main(String[] args) {
		// Testing the Message Board
		
		MessageBoard board = new MessageBoard();
		
		User madalin = new User("Madalin");
		User alina = new User("Alina");
		
		Message m1 = new Message(madalin, "Hey Alina, how are you doing?");
		Message m2 = new Message(alina, "I'm doing good, thanks for asking!");
		
		board.post(m1);
		board.post(m2);
		
		System.out.println(board.display());

	}

}
