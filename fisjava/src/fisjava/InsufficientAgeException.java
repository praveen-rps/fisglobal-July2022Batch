package java8;

public class InsufficientAgeException extends RuntimeException {

	public InsufficientAgeException() {
		// TODO Auto-generated constructor stub
		super("age must be greater than 18 to vote...");
	}

}
