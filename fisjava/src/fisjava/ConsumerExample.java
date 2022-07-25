package java8;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> c = x -> System.out.println("The square is : "+ (x*x));
		c.accept(10);
	}
}


/*public interface Consumer<T>{
 * public void accept(T t);
 * }
 * 
 * x->{
 * 
 * 
 * };
 * 
 * 
 */
