package io;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmpObjectRead {
	
	public static void main(String args[]) throws FileNotFoundException, IOException {
		ObjectInputStream in = null;
		try
		{
			in = new ObjectInputStream(new BufferedInputStream
					(new 	FileInputStream("d://employeedata")));
			while(true)
			{
				Employee empobj = (Employee) in.readObject();
				empobj.printEmployee();	
			}
		}
		catch (EOFException e)
		{
		}
		catch (ClassNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			if (in !=null)
			{
				in.close();
			}
		}
	}

}
