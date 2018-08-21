package workHome4;

public class MyException extends Exception {
	@Override
	public String getMessage() {
		return "No place "+super.getMessage();
	}

}
