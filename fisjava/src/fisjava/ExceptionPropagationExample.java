package java8;

class Test1{
	public static void f1() throws NullPointerException{
		
		System.out.println("Inside the f1 method of test1");
		String str = null;
		str.equals("praven");
	}
	
	public static void f2() {
		f1();
	}
}


public class ExceptionPropagationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			Test1.f2();
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}

	}

}
