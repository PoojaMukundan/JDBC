package EMPLOYEEdb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class TESTselect {

	public static void main(String[] args) {
			
		try {
			Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/EmployeeDB","pooja","pooja");
			Statement st=conn.createStatement();
			String str="select * from employee;";
			ResultSet rs=st.executeQuery(str);
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				System.out.println(id  +" "+" "+  name);
			}
			System.out.println("Success");
	}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}
}

