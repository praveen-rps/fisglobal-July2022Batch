package fisjava;

interface Inter1{
	public void f1();
	public void f2();
}

interface Inter2{
	public void f3();
	public void f4();
}
class ClassT implements Inter1{
	public void f5() {
		System.out.println("inisde the f5 method...");
	}

	@Override
	public void f1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void f2() {
		// TODO Auto-generated method stub
		
	}
}

interface Inter3 extends Inter1, Inter2{
	
}

class Class5 implements Inter3{

	@Override
	public void f1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void f2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void f3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void f4() {
		// TODO Auto-generated method stub
		
	}
	
}
class MultiInheritance implements Inter1, Inter2{

	@Override
	public void f3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void f4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void f1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void f2() {
		// TODO Auto-generated method stub
		
	}
	
}
public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
