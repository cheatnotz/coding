
public class StringLongEnoughException extends Exception {
	//default constructor with no message
	public StringLongEnoughException() {
		//create Exception (superclass) with default message
		super("MyException occurs");
	}
	
	//constructor with message
		public StringLongEnoughException(String message) {
			super(message);
	}

}
