package DependencyInversion;

import DependencyInversion.Email;
import DependencyInversion.phone;
import LiskovBirds.Animal;
import LiskovBirds.Owl;

public class Test {
	public static void main(String[] args) {
		Owl owl=new Owl();
		Animal an=new Animal();
		an.learnToFly(owl);
	}
}
