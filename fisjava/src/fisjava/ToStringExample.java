package fisjava;
class A{
	
	@Override
	public String toString() {
        return "In class A" ;
    }

}

class B{
	
	@Override
	public String toString() {
        return "In class B" ;
    }
	
}
public class ToStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a =new A();
		B b = new B();
		
		System.out.println(a);
		System.out.println(b);

	}

}
