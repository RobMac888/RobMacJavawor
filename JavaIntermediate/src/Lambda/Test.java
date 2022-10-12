package Lambda;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Person p=new Person();
		//p.greet();
		//Greeting gr=new Greeting();
		//Greeting gr=new Person();
		//Anonymous class
		Greeting gr=new Greeting(){
			public void greet() 
			{
				System.out.println("Hello World");
			}

		};
		gr.greet();  
		//now with this I do not need a person class 
		//there is 
		/*Lambda Expressions were added in Java 8. A lambda expression 
		 * is a short block of code which takes in parameters and returns a value.
		 *  Lambda expressions are similar to methods, but they do not need a 
		 *  name and they can be implemented right in the body of a method.*/
		
		/*Lambda expression
		 * leftside to right
		 * arguments -> body
		 * () -> {printing/calculation}
		 * 
		 * 
		 * */
		Greeting gr1=()->{System.out.println("Helloworld");};
		gr1.greet();
		
		GreetingWithName grName=(x)->{System.out.println("Hello "+x);};
		grName.greet("Kevin");
		
		GreetingWithReturn grReturn=(x)->{ return "Hello "+x ;};
		System.out.println(grReturn.greet("Hasan"));
	}

}
