package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test {
	public static void main(String[] args) {
		Product prod=new Product(1001,"TV",1000,"Apple");
		try {
			
			
			
			FileOutputStream fileOut=new FileOutputStream("object.txt");
			
			ObjectOutputStream oOut=new ObjectOutputStream(fileOut);
			
			oOut.writeObject(prod);
			
			
			
			FileInputStream fileIn=new FileInputStream("object.txt");
			
			ObjectInputStream oIn=new ObjectInputStream(fileIn);
			Product prodCopy=(Product)oIn.readObject();
			System.out.println(prodCopy.prodId);
			System.out.println(prodCopy.name);
			System.out.println(prodCopy.brand);
			System.out.println(prodCopy.price);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
