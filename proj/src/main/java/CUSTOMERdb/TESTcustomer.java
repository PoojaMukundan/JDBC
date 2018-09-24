package CUSTOMERdb;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class TESTcustomer {

	public static void main(String[] args) {
		try {
		customer cu=new customer();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter id");
		int cid=Integer.parseInt(br.readLine());
		/*System.out.println("enter name");
		String name=br.readLine();
		System.out.println("enter age");
		int age=Integer.parseInt(br.readLine());*/
		//cu.insert(id,name,age);
		//cu.update(cid, name, age);
		//cu.delete(cid);
		cu.select(cid);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
}
}