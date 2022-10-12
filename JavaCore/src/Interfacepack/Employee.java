package Interfacepack;

public class Employee extends Person implements Artist,Player {
	public void doSomething()
	{
	System.out.println("Every employee has job profile to perform his duties");
	}
	public void doArt()
	{
		System.out.println("Employees can also be interested in some art");
	}
	public void doPlay() {
		System.out.println("Playing something is good for mental and physical health");
	}
	public void do1() {
		System.out.println("Everything is doable");
	}
	

}
