package Singleton;

public class Sample {
	private static Sample x;
	//private static Sample x=new Sample();
	private Sample() {
		
	}
	public static Sample getObjectOfSample() {
		if(x ==null) {
			x = new Sample();
		}
		return x;
	
	}
	public void hello()
	{
		System.out.println("Hello");
	}
	public void hi()
	{
		System.out.println("hi");

	}

}
/*
Save this code/screenshot dude as it's VERY 
important! I wasn't going to tell anyone this but I'll share it with you. 
Upasana has given us this example because it is the EXACT way in which we create the SQL_Connector thingy. 
We create it once and then access it's methods (create, update, remove..etc).. She has given us the 
answer and she even said something like ..."   ... SQL Coonector=new Connector()...."

We will need this for the project.

If you mix this code with our SQL Connector code 
(Connection exception & the various methods for update, remove...) 
then you have everything you need for the connector class and it's methods.

jdbc package

*/