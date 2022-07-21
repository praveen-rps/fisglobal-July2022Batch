package fisjava;

public class TestEmployee2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee.org="Fis Gloabl";
		
		Employee emp1 = new Employee();
		emp1.showData();
		
		Employee emp2 = new Employee("praveen");
		emp2.showData();
		
		Employee emp3 = new Employee("praveen","Manager");
		emp3.showData();
		
		Employee emp4 = new Employee("praveen","Manager","finance");
		emp4.showData();

	}

}
