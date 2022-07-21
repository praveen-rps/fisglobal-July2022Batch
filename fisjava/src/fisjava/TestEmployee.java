package fisjava;

public class TestEmployee {
	public static void main(String args[]) {
		Employee emp1 = new Employee("pavan");
		//emp1.setName("pavan");
		emp1.setDept("quality");
		emp1.setDesg("manager");
		emp1.setOrg("fis global");
		emp1.showData();
		System.out.println(emp1);
		
		Employee emp2 = new Employee("kumar");
	//	emp2.setName("kumar");
		emp2.setDesg("lead");
		emp2.setDept("operations");
		//emp2.setOrg("FIS");
		
		Employee.org="FIS";
		Employee.showStaticData();
		emp2.showData();
		System.out.println(emp2);
		emp1.showData();
		
		Employee emp3 = new Employee();
		emp3.showData();
		
		Employee emp4 = new Employee();
		emp4.showData();


	}

}
