package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
   
public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp=new Employee(3456,"Nigel",12000,"ABC","nigel@gmail.com");
		try {
			
			
			
			FileOutputStream fileOut=new FileOutputStream("object.txt");
			
			ObjectOutputStream oOut=new ObjectOutputStream(fileOut);
			
			oOut.writeObject(emp);  //this is name of object NOT class
			
			
			
			FileInputStream fileIn=new FileInputStream("object.txt");
			
			ObjectInputStream oIn=new ObjectInputStream(fileIn);
			Employee empCopy=(Employee)oIn.readObject();
			System.out.println(empCopy.empId);
			System.out.println(empCopy.name);
			System.out.println(empCopy.salary);
			System.out.println(empCopy.designation);
			System.out.println(empCopy.email);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}

