import java.sql.*;
import java.util.Scanner;

public class Delete {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the name");
			String name=sc.next();
			System.out.println("enter the city");
			String city=sc.next();
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "password");

			Statement stmt = conn.createStatement();

			stmt.execute("delete from registration where name='"+name+"'");
			System.out.println(stmt);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
