package fisjava;

interface Area {
	public double calCircleArea(int radius);
}

interface Test1 {
	public boolean checkGreater(int a, int b);
}

class TTest implements Test1 {

	@Override
	public boolean checkGreater(int a, int b) {
		// TODO Auto-generated method stub
		//a=10, b=100;
		if (a < b)
			return true;
		else
			return false;
	}
}

/*
 *(a,b)->a<b
 */
class TestArea implements Area {
	public double calCircleArea(int radius) {
		return 3.141 * radius * radius;
	}
}

/*
 * public double calCircleArea(int radius){ return 3.141*radius*radius; }
 * 
 * radius -> 3.141*radius*radius;
 * 
 */

public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestArea a1 = new TestArea();
		Test1 t1 = (a,b)-> a>b;
		Area a = x -> 3.141 * x * x;

		System.out.println(a.calCircleArea(5));
		System.out.println(a1.calCircleArea(5));
		System.out.println(t1.checkGreater(2,10));

	}

}
