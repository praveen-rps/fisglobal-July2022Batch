
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		// 1. load the driver 
		
		 Class.forName("com.mysql.jdbc.Driver");
	//rps@12345	 
		 //2. establish connection
		 String url="jdbc:mysql://localhost:3306/fisglobal";
		 String username="root";
		 String password="root";
		 
		 Connection con = DriverManager.getConnection(url,username,password);
		 
		 //3. create a statement object
		  Statement st = con.createStatement();
		  
		  //4. execute the query and fetch the result set
		  	ResultSet rs = st.executeQuery("select * from users");
		  	
		  	//process the data
		  	while(rs.next())
		  		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		  	
		  	// close the connections
		  	rs.close();
		  	st.close();
		  	con.close();

	}
	

}
