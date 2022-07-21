package fisjava;

class TestB{
	TestB(){
		show();
		System.out.println("Inside the default constructor");
	}
	
	TestB(int a){
		this();
		System.out.println("Inside the parameterized constructor");
	}
	public void show() {
			
		System.out.println("inside the show method...");
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestB b1 = new TestB();
	//	TestB b2 = new TestB(10);
		System.out.println(10);
		System.out.println(10.2334);
		System.out.println("praveen");
		System.out.println(true);
		
		System.out.println(10+20);
		System.out.println("hello"+" hai");
		

	}

}
