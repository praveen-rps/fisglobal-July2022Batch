package fisjava;

import java.util.ArrayList;
import java.util.List;

public class ForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3 forms of for loop
		// simple for
		for (int i = 0; i < 10; i++)
			System.out.println("Inside the simple for loop");
		// enhanced for
		int a[]= {10,20,30,40};
		for(int x:a) {
			System.out.println(x);
			System.out.println("Inside the enhanced for loop");
		}
     	// forEach  --> useed to apply on collections
		List<String> ar = new ArrayList();
		ar.add("india");
		ar.add("china");
		ar.add("japan");
		ar.forEach(System.out::println);
	}

}
