package java8;

import java.util.Optional;
import java.util.function.Consumer;
public class OptionalExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Optional<String> str1 = Optional.of("Java programming"); 
		
		Optional<String> str2 = Optional.empty();

		 if (str2.isPresent()) {          
	            System.out.println("String is not empyt");       
	         } 
	         else {            
	            System.out.println("String is empty");      
	         }
		 
		 Consumer<String> c = s-> System.out.println(s.toUpperCase());

		 str1.ifPresent(c);
		 
	}

}
