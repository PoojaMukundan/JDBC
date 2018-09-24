package CUSTOMERdb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//import java.sql.ResultSet;


public class customer {
	
	public void insert(int id,String name,int age) {
	try {
		Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/EmployeeDB","pooja","pooja");
		String str="insert into customer values(?,?,?);";
		PreparedStatement st=conn.prepareStatement(str);
		st.setInt(1,id);
		st.setString(2,name);
		st.setInt(3,age);
		st.execute();
		System.out.println("Insert Successful");
        }
	catch(Exception ex)
	{
		ex.printStackTrace();
	}
	}
	public void update(int cid,String name,int age) {
		try {
			Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/EmployeeDB","pooja","pooja");
			String str="update customer set name=?,age=? where cust_id=?;";
			PreparedStatement st=conn.prepareStatement(str);
			st.setInt(3,cid);
			st.setString(1,name);
			st.setInt(2,age);
			st.executeUpdate();
			System.out.println("Update Successful");
	        }
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
		public void delete(int cid) {
			try {
				Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/EmployeeDB","pooja","pooja");
				String str="delete customer where cust_id=?;";
				PreparedStatement st=conn.prepareStatement(str);
				st.setInt(1,cid);
				st.executeUpdate();
				System.out.println("Delete Successful");
		        }
			catch(Exception ex)
			{
				ex.printStackTrace();
			}

   }
		public ResultSet select(int cid) {
			
		ResultSet rs=null;
			try {
				Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/EmployeeDB","pooja","pooja");
				String str="select * from customer where cust_id=?;";
				PreparedStatement st=conn.prepareStatement(str);
				st.setInt(1,cid);
				rs=st.executeQuery();
				System.out.println("CUST_ID NAME AGE");
				while(rs.next())
				{
					cid=rs.getInt(1);
					String name=rs.getString(2);
					int age=rs.getInt(3);
					System.out.println(cid  +"  "+"  "+  name+"  "+"  "+age);
				}
				
		}
		        
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		return rs;
}	
}
	

	
	


