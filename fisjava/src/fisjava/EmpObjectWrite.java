package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
	private int empno;
	private String empname;
	private double empsalary;
	
	public Employee(int empno, String empname, double empsalary)
	{
		this.empno = empno;
		this.empname = empname;
		this.empsalary = empsalary;
	}
	public void incrementSalary()
	{
		empsalary = empsalary + 1000.00;
	}
	public void printEmployee()
	{
		System.out.format("Employee Number %d, name %s, having salary Rs 			%.2f", empno, empname, empsalary);
	}
}


public class EmpObjectWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String datafile = "d://employeedata";
		ObjectOutputStream out = null;
		try
		{
			Employee empobj1 = new Employee(1, "Raj", 2000.00);
			Employee empobj2 = new Employee(2, "Praveen", 3000.00);
			out = new ObjectOutputStream(new BufferedOutputStream
					(new FileOutputStream(datafile)));
			out.writeObject(empobj1);
			out.writeObject(empobj2);
		}
		finally
		{
			if (out !=null)
			{
				out.close();
			}
		}
		System.out.println("Object is written...");


	}

}
