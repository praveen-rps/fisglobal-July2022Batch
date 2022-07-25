package java8;

public class TryCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10, b = 0, c;
		String str = null;

		try {
			// opening a file
			c = a / b;
			System.out.println("The division is :" + c);
			System.out.println("After division");
			// close the file
			
		}
		catch (StringIndexOutOfBoundsException e) {

			// close the file
		} 
		catch (RuntimeException e) {

		}
			
		catch (Exception e) {
			System.out.println("Inside the arthimetic exception");
			System.out.println(e);
		} 
		
		
		try {
			//open the file
			str.equals("praveen");
		} 
		catch (NullPointerException e) {
			System.out.println("Insid the null pointer catchblock...");
			System.out.println(e);
		}

		finally {
			// close the file
			System.out.println("Inside the finally block...");
		}
		System.out.println("After the finally block....");

	}

}
