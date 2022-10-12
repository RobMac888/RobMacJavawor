package DependencyInversion;

public class Test {

}



import DependencyInversion.Email;
import DependencyInversion.phone;

public class Test {
	public static void main(String[] args) {
		Owl owl=new Owl();
		Animal an=new Animal();
		an.learnToFly(owl);
	}
}
