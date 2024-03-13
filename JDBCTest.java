import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTest {

	public static void main(String[] args) {

		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the name");
			String name=sc.next();
			System.out.println("enter the city");
			String city=sc.next();
			System.out.println("enter the email");
			String email=sc.next();
			System.out.println("enter the mobile");
			String mobile=sc.next();
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "password");
			Statement stmt = conn.createStatement();
			stmt.execute("insert into registration values('"+name+"','"+city+"','"+email+"','"+mobile+"')");
			System.out.println(stmt);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}