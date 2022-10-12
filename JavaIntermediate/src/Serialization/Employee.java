package Serialization;

public class Employee implements Serializable {
	
	public int empId;
	public String name;
	public transient int salary;
	public String designation;
	public String email;
	public Employee(int empId, String name, int salary, String designation, String email) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.email = email;
	}
  
}

