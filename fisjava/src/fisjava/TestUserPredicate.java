package java8;

import java.util.function.Predicate;

class User{
	String username;
	String password;
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}

public class TestUserPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User("admin","12345");
		User user2 = new User("user","user");
		
		Predicate<User> 
		p = user-> user.getUsername().equals("admin") && user.getPassword().equals("12345");
		
		if(p.test(user2))
				System.out.println("Valid user");
		else
			System.out.println("invalid user..");
		

	}

}
