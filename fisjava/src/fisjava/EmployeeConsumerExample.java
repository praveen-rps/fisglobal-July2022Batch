package java8;

import java.util.function.Consumer;

public class EmployeeConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee("sunil", "finance", "Manager");
		Employee emp2 = new Employee("kishore", "quality", "Lead");

		Consumer<Employee> c = emp -> {
			System.out.println("The Name is : " + emp.getName());
			System.out.println("The Department is : " + emp.getDept());
			System.out.println("The Department is : " + emp.getDesg());
		};

		c.accept(emp1);
		c.accept(emp2);
	}

}
