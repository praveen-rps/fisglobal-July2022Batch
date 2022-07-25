package java8;

public class InvalidAgeException extends RuntimeException{

	public InvalidAgeException() {
		// TODO Auto-generated constructor stub
		super("Age cannot be greater than 100 or less than 0");
	}

}
