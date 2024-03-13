import java.sql.*;
import java.util.Scanner;

public class Select {

	public static void main(String[] args) {
		
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the name");
			String name=sc.next();
			System.out.println("enter the city");
			String city=sc.next();
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","password");
	 		Statement stmt = conn.createStatement();
			ResultSet result=stmt.executeQuery("select * from registration");
			while(result.next()) {
				System.out.println(result.getString(1));
				System.out.println(result.getString(2));
			 	System.out.println(result.getString(3));
				System.out.println(result.getString(4));
			}
	}
		catch(Exception e) {
			e.printStackTrace();
		}
}
}
