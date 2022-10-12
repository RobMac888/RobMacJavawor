package Constructor;

public class TestPerson {

	public static void main(String[] args) {
		Person p1=new Person();
		p1.name="Robert";
		p1.age=35;
		p1.address="Southampton";
		p1.phone=12345;
		
		Person p2=new Person("Hilda", 25,"UK",345678);
		Person p3=new Person("Arifi", 25,"UK",345699);
		Person p4=new Person("Kev", 0);
		p4.address="London";
		p4.phone=345678;
	}
}
