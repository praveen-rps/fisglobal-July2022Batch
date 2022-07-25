package java8;

public class Voting {

	public Voting() {
		// TODO Auto-generated constructor stub
	}
	
	public void checkAge(int age) throws InvalidAgeException, InsufficientAgeException {
		if(age >=18 && age <=100)
			System.out.println("You are eligible for voting..");
		else if(age >100 || age < 0)
			throw new InvalidAgeException();
		else
			throw new InsufficientAgeException();
			
	}

}
