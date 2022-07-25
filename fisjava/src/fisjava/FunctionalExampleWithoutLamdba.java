package fisjava;

interface Mathematics{
	public int add(int a, int b);
}

class Maths implements Mathematics{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
}
public class FunctionalExampleWithoutLamdba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths m = new Maths();
		System.out.println("The sum of 10 and 20 is : "+m.add(10,20));

	}

}
