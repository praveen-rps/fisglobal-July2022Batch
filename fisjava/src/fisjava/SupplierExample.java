package java8;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<Date> s= ()-> new Date();
		
		Supplier<String> otps= ()->{
			String otp="";
			for(int i=0;i<6;i++)
				otp=otp+(int)(Math.random()*10);
			
			return otp;
		};
		
		System.out.println(s.get());
		System.out.println(s.get());
		
		System.out.println("Otp1 ---> " + otps.get());
		System.out.println("Otp2 ---> " + otps.get());
		System.out.println("Otp3 ---> " + otps.get());

	}

}
