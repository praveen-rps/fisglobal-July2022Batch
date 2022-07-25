package java8;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a=100, b=20;
			int balance=2900;
			if(a < b) {
				System.out.println("b is bigger");
				throw new ArithmeticException();
			}
			else {
				System.out.println("a is bigger");
				throw new NullPointerException();
			}
			
		}
		catch(ArithmeticException e) {
			System.out.println("Inside the arithematic exception block..");
		}
		catch(NullPointerException e) {
			System.out.println("Inside the nullpointer exception block..");
		}

	}

}
