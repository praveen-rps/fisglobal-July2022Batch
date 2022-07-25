package fisjava;

import java.util.Scanner;

@FunctionalInterface
interface Calcs{
	public void doSum() ;
	
	
}

//read two values from keybord
//and find the sum and display

public class TestMaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Calcs c = ()->{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		int m = sc.nextInt();
		System.out.println("Enter second value");
		int n = sc.nextInt();
		System.out.println("The sum is : "+(m+n));
	};
	
	c.doSum();

	}

}
