package abc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ABC {
	public static void main(String[] args) throws Exception {
		
	
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("class load");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","root");
	System.out.println("connection done");
	Statement stmtStatement=con.createStatement();
			stmtStatement.executeUpdate("insert into  login values(1,'rupesh@123','Rupessh'");
	System.out.println("data insert sucessfully");
	}

}
