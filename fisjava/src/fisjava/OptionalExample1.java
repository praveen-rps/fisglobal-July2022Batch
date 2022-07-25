package java8;

import java.util.Optional;
import java.util.function.Consumer;

public class OptionalExample1 {
	public static void calPrime(Optional<Integer> opt) {
		Consumer<Integer> c =x->{
			int f=1;
			for(int i=1;i<=x;i++)
				f=f*i;
			System.out.println(f);
		};
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OptionalExample1.calPrime(null);
		
		

	}

}
