package java8;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> p1 = x-> x%2==0;
		Predicate<String> p2 = s-> s.length()>10;
		Predicate<Integer> p3 = x->x>20;
		
		System.out.println(p1.test(10));
		System.out.println(p1.test(23));
		System.out.println(p2.test("praveen"));
		System.out.println(p2.test("java programming"));
		
		System.out.println(p3.and(p1).test(24));
		
		System.out.println(p3.or(p1).test(16));
		System.out.println(p3.or(p1).test(23));


	}

}
