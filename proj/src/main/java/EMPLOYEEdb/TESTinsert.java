package EMPLOYEEdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;


public class TESTinsert {

	public static void main(String[] args) {
			
		try {
			Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/EmployeeDB","pooja","pooja");
			Statement st=conn.createStatement();
			String str="insert into employee values(3,'pears');";
			st.execute(str);
			System.out.println("Success");
	}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}
}
