package java8;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating Optional object from a String
        Optional<String> str1 = Optional.of("Game of Thrones");        
        
        //Optional.empty() creates an empty Optional object  
        Optional<String> str2 = Optional.empty();

        //orElse() method
        System.out.println(str1.orElse("Default Value is Ignored")); 
        System.out.println(str2.orElse("Default Value is considerd")); 

        //orElseGet() method
        
        Supplier<String> s = ()-> "string example";
        System.out.println(str1.orElseGet(() -> "Default Value-- not performed")); 
        System.out.println(str2.orElseGet(s)); 

	}

}
