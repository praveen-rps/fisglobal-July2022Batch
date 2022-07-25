package java8;

import java.util.Scanner;

public class TestVote {

	public TestVote() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Voting v = new Voting();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of person");
		int age = sc.nextInt();
		
		try {
			v.checkAge(age);
		}
		catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		catch(InsufficientAgeException e) {
			System.out.println(e.getMessage());
		}

	}

}
