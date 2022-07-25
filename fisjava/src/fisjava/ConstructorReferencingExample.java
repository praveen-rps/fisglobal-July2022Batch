package java8;

class Sample12 {
	private String s;
	

	Sample12(String s) {
		this.s = s;
		System.out.println("Constructor Executed:" + s);
	}

	@Override
	public String toString() {
		return "Sample12 [s=" + s + "]";
	}
	
}

interface Interf {
	public Sample12 get(String s);
}

public class ConstructorReferencingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interf f1= str-> new Sample12(str);
		
		Interf f2= Sample12::new;
		
		System.out.println(f2.get("praveen"));

	}

}
