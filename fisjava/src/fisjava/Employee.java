package fisjava;

public class Employee {
	
	private String name;  // instance variables
    private String dept;
    private String desg;
    public static String org;
    
    Employee(String name){
    	this.name=name;
    	System.out.println("object created using parameterized constructor");
    }
    
    Employee(String name, String desg){
    	this.name=name;
    	this.desg=desg;
    	System.out.println("object created using parameterized constructor");
    }
    
    Employee(String name, String desg, String dept){
    	this.name=name;
    	this.desg=desg;
    	this.dept=dept;
    	System.out.println("object created using parameterized constructor");
    }
    
    Employee(){
    	System.out.println("object created using zero parameter constructor");
    }
    
    
    static {
    	System.out.println("Inside the static block");
    }
    
    {
    	System.out.println("inside the non static block...");
    }
    
	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}
	public String getName() {    
		return name;
	}
	public void setName(String name) {  // name is method variable
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
    public void showData() {
    	System.out.println("Name: "+name+" Desg : "+desg+" Dept :"+dept+" Org: "+org);
    }
    
    public static void showStaticData() {
    	System.out.println(org);
    }

}
