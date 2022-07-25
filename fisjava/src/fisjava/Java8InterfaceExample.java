package fisjava;

abstract class AbsExmple
{
	AbsExmple(){
		
	}
	public void test1() {
		System.out.println("inside the test1 method of AbsExample");
	}
	public void test2() {
		System.out.println("Inside the test2 method of AbsExample");
	}
	abstract public void test3();
}

class AbsExampleImpl extends AbsExmple{
	public void test3() {
		System.out.println("Inside the test3 of AbsExampleImpl class");
	}
}

interface Java8{
	public void test1();
	public void test2();
	public default void test3() {
		System.out.println("inside the default method of interface");
	}
	public static void test4() {
		System.out.println("Inside the static method of interface...");
	}
}

class Java8Impl implements Java8{
	public void test1() {
		System.out.println("Inside the test1 of java8impl class");
	}
	public void test2() {
		System.out.println("Inside the test2 of java8impl class");
	}
	public void test3() {
		System.out.println("inside the test3 of java8impl class");
	}
}

public class Java8InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbsExampleImpl obj = new  AbsExampleImpl();
		obj.test1();
		obj.test2();
		obj.test3();
		
		Java8Impl obj2 = new Java8Impl();
		obj2.test1();
		obj2.test2();
		obj2.test3();
		Java8.test4();
	}
}
