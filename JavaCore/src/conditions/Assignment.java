package conditions;

import java.util.Scanner;

public class Assignment {
	public static void main(String[] args)  {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scn.next();
		System.out.println("Enter your city");
		//String city="London";
		String city=scn.next(); //create
		if(city.equals("London"))
			System.out.println("Hello "+name+" you are a Brit");
		else if(city.equals("NewYork"))
			System.out.println("Hello "+name+ "you are a NewYorker");
		else
			System.out.println("I dont know");
		
		String x="Rob";/// --->0001 string obj1
		x="Hello  "+x;//--->0002 obj2
		x=x+" How are you?";   //0003 obj 3
		
		String city1="";//000x obj1
		city1="NewYork";// - ->00028
		
	}

}
