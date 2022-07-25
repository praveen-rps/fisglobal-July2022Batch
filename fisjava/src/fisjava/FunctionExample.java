package java8;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Function<Integer,Double> f3 = radius -> 3.141 * radius * radius;
		
		Function<Integer,Integer>  fact = x->{
			int f=1, ft=1;
		    if( x==1 || x==0)
				ft=1;
		    else{
					for(int i=2;i<=x;i++)	
						ft=ft*i;
			}
		 	return ft;

		};
		
		Function<String,Integer> f1 = str->str.length(); 
		Function<String,String> f2= str->str.toUpperCase();
		
		System.out.println("The factorial of 4 is: "+fact.apply(4));
		System.out.println("The string length of praveen is : "+f1.apply("praveen"));
		System.out.println("The upper case of india is "+ f2.apply("india"));
		
		System.out.println("The area of circle with 5 radius is "+ f3.apply(5));

	}

}
