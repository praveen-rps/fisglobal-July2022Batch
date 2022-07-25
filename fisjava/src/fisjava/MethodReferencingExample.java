package java8;

class Sample{
	public static void display() {
		for(int i=10;i<20;i++)
			System.out.println(i);
	}
}
public class MethodReferencingExample {

	public static void main(String[] args) {

	//	Sample s = new Sample();
		
	// when the method is static, then we have to refer on the object
	// Runnable r1 = s::display;	
		
	Runnable r1 = Sample::display;
	
	Thread t = new Thread(r1);
	t.start();

	}
}
