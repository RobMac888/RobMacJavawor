package Lambda; 
@FunctionalInterface
public interface Greeting {
	public void greet(); 
	
	
	
	//interfaces contain abstract methods
	//interfaces cannot be instantiated
	//we can implement one class and implement multiple interfaces
	//it is therefore preferred to use more interfaces

	
	//only declaration and no body
	//body is implemented by the class
	//public void welcome(); (delete this because with @FunctionalInterface gives error)
	
	
	
	
	//Greeting is not a functional interface
	//new interface "Doable"

}
