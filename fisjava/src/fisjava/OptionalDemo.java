package java8;

import java.util.Optional;

public class OptionalDemo {
	
	
	public static void main(String[] args)
	{
		
		/*
		public static void main(String[] args)
		{
			String[] words = new String[10];
		//	words[5]="INDIA";
			String word = words[5].toLowerCase();
			System.out.print(word);
		}
		*/
	      String[] str = new String[10]; 
	     // str[9]="java programming";
	      Optional<String> isNull = Optional.ofNullable(str[9]);  
	     
	      if(isNull.isPresent()){     
	         //Getting the substring           
	         String str2 = str[9].substring(2, 5);          
	         //Displaying substring           
	         System.out.print("Substring is: "+ str2);       
	      }     
	      else{      
	         System.out.println("Cannot get the substring from an empty string");     
	      }
	}
	
}
