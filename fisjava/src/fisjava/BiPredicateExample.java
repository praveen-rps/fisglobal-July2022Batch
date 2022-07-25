package java8;

import java.util.function.*;

public class BiPredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiPredicate<Integer,Integer> t =
			(a,b)-> a<b;
			
			System.out.println(t.test(10, 20));
			
		BiFunction<Integer,Integer,Integer>
		t1 = (a,b)->a+b;
		
		System.out.println(t1.apply(10, 20));
		
		

	}

}
