package temp;

import java.util.Scanner;

//import java.lang.*;

public class Test {
    public static void main(String[] args ) {
    	Scanner scn=new Scanner(System.in);//accept the input
    	System.out.println("Please enter your name");
    	String name=scn.next();
    	System.out.println("Please enter the year of birth");
    	int year=scn.nextInt();
    	System.out.println("Hello "+name"!! Welcome to the world of Java, you were born in "+year);
    	
    	System.out.println("Please enter your first name");
    	String fname=scn.next();
    	System.out.println("Please enter your last name");
    	String 1name=scn.next();
    	System.out.println("Hello "+fname+" "+1name);
    }
}
