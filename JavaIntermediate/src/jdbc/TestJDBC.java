package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DriverManager;

public class TestJDBC {
	public static void main(String[] args) {
		try {           //try and catch - to connect to the database
			String url="jdbc:mysql://localhost:3306/javadb";     //if oracle it would be different
			String userName="root";
			String password="1234";
			Connection con=DriverManager.getConnection(url,userName,password);
			System.out.println("Connected successfully");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Something went wrong ");
		}
	}

}
  