package Array;

import java.util.Scanner;

public class ArrayExample2 {

	public static void main(String[] args) {
		String[] city=new String [5];
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter names of cities");
		for(int i=0;i<city.length;i++)
		{
			city[i]=scn.next();
		}
		System.out.println("List of cities");
		for(int i=0;i<city.length;i++)
		{
			System.out.println(city[i]);
		}
		
		//enahanced for loop array for loop
		for(String x:city)
		{
			System.out.println(x);
		}
		
		int[] marks=new int[5];
		marks[0]=100;
		marks[1]=200;
		marks[2]=300;
		marks[3]=400;
		marks[4]=500;
		
		for(int x:marks)
		{
			System.out.println(x);
			
		}
	}
}
