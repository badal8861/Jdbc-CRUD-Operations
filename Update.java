import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Update {

	public static void main(String[] args) {

		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the name");
			String name=sc.next();
			System.out.println("enter the city");
			String city=sc.next();

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "password");
			Statement stmt = conn.createStatement();
			stmt.execute("update registration set city='"+city+"' where name='"+name+"'");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}