package jdbc;   //this file copied from TestJDBC

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadRecords {
	public static void main(String[] args) {
		try {           //try and catch - to connect to the database
			String url="jdbc:mysql://localhost:3306/javadb";     //if oracle it would be different
			String userName="root";
			String password="1234";
			Connection con=DriverManager.getConnection(url,userName,password);
			System.out.println("Connected successfully");
			
			
			String query="select * from customer";
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next())
			{	
				int id=rs.getInt(1);
				String name=rs.getString(2);
				int phone=rs.getInt(3);
				String email=rs.getString(4);
				System.out.println("***"+id+"***"+name+"****"+phone+"****"+email+"****");
				
			}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Something went wrong ");
		}
	}
	
}
