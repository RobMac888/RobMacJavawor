package Constructor;   //Constructors create the object, set values  

public class Person {
	String name;
	int age;
	String address;
	int phone;
	
	//public person() {}
	public Person() {
		System.out.println("Person class instantiated");
	}
	
	public Person(String n, int a, String add, int p) {
		name=n;
		if(a<=0)
		{
			System.out.println("age can not be less than 0");
		}
		else{	
			age=a;
		}
		address=add;
		phone=p;
	}
	public Person(String n, int a) {
		name=n;
		if(a<=0)
		{
			System.out.println("age can not be less than 0");
		}
		else{
			age=a;
		}
		
	}}