//this is a WHILE loop
package Iteration;

public class Iteration1 {

	public static void main(String[] args) {
		
		int catCount = 0;
        boolean notEnoughCats = true;

        while(notEnoughCats) {
            System.out.println("Another cat");
            catCount++;

            if(catCount > 273) {
                notEnoughCats = false;
            }
        }

        System.out.println("Too many cats what do I do");
    }

	}

/*Prints x273
//Above is a WHILE loop


while()-loop
A while()-loop is a loop type that primarily works with a boolean value, meaning that whilst the boolean value 
meets a specified condition the code will loop.
Think of a while()-loop as an if()- statement that doesn't stop executing until the condition is no longer met.

In the above example we are declaring and initialising a variable of type int with the name catCount and a value of 0.

We are also declaring and initialising a variable of type boolean with the name notEnoughCats and a value of true.

In the main method we are iterating over a block of code while notEnoughCats is true, once this becomes false 
the loop will stop executing.

If notEnoughCats is true, we print "Another cat" and add 1 to catCount.

Within the loop we have a conditional that checks if catCount is greater than 273, if it is then we set 
notEnoughCats to false.

Once we set notEnoughCats to false, the while()-loop's condition returns false, and so Java stops executing the loop.*/