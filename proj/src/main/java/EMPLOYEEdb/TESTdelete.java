package EMPLOYEEdb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class TESTdelete {

	public static void main(String[] args) {
			
		try {
			Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/EmployeeDB","pooja","pooja");
			Statement st=conn.createStatement();
			String str="delete employee where id=3;";
			st.execute(str);
			System.out.println("Success");
	}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}
}

