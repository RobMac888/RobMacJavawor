package LiskovBirds;

public class Test {
	public static void main(String[] args) {
		Owl owl=new Owl();
		Animal an=new Animal();
		an.learnToFly(owl);
	}
}
//what is this testing then?
/*
 * 
 Create class test,   create new object 'owl' of class Owl. 
 create ne object 'an' of class Animal. Class 'Animal' calls method fly.  
 (for "Flyingbird flybird". )   so an.learntoFly(owl) means .... use method 
 'learntofly' from object 'an'. THe usage requires the argument "('flying bird') 
 of name 'flybird'. so basically its just calling learntofly for the class owl.
from Kev to Rob Mac (privately):    12:59  PM
It's hard to explain without pointing to lines in the code.
from Rob Mac to Kev (privately):    12:59  PM
Thanks!  And there's never a rush to answer, cheers K
from Kev to Rob Mac (privately):    1:01  PM
So an.learntofly(owl) basically calls "Animal" class, which calls 'learntofly' 
method. That method is declared also in 'owl' class so the owl can use Animal.learntofly()..
 in this case it's an.learntofly() because 'an' is an object of type animal.
from Kev to Rob Mac (privately):    1:07  PM
The trouble is that the programs we are making are so small that all this Object oriented 
guidelines stuff is uselss and just overcomplicates everything. If we were making huge programs 
with loads of classes and functinos then all this would be useful.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */



