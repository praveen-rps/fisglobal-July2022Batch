package fisjava;
class Person{
	String name;
	String hobby;
	Person(){
		name="anil";
		hobby="listening to music";
	}
	public void showPersonDetails() {
		System.out.println("Name = "+name+" Hobby ="+hobby);
	}
	
	public void shoWData() {
		System.out.println("Inside the person showdata method..");
	}
}

class Manager extends Person{
	String hobby;
	String dept;
	Manager(){
		hobby="reading books";
		dept="Finance";
	}
	public void showManagerDetails() {
		super.shoWData();
		System.out.println("Dept = "+dept+" Hobby ="+super.hobby);
	}
	
	@Override
	public void shoWData() {
		System.out.println("Inside the manager showdata method..");
	}
}

public class OverrdingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager();  
		// number of variables = 3  but 4
		// numberr of methods = 2
		manager.showManagerDetails();
		manager.shoWData();

	}

}
