//this is a WHILE loop
package Iteration;

	public class QAIteraltionsEx3 {

		
			public static void main(String[] args) {
			for(int a = 0; a < 15; a++) {
        	if(a == 2) {   //if  i is equal to two
                continue;
            }
            if(a == 11) {
                break;
            }
            System.out.println(a);
        }
    }
}

/*
Transfer and Control Statements
We can manipulate the flow of code through a number of keywords:

Break: Break statements break out of the current code block, in loops 
this means that Java will skip the rest of the loop and move onto executing the 
rest of the code.
Continue: Continue statements break out of the current iteration of a code block, 
in loops this means that Java will skip the current iteration of the code block and move onto the next.
Return: Return statements are used in methods to return values according to the methods return type, 
ending the method.
	
	
	
	In the above example we are running a for()-loop starting with a = 0, with the condition a < 10, 
	and incrementing i by 1 after each iteration.
	Each iteration will run the first if()-statement and check if a is equal to 2.
If it is, then because of the continue keyword Java will skip this iteration and move onto the next one.

	If a is not equal to 2, then the iteration will move onto the second if()-statement and check 
	if a is equal to 7.

	If a does equal 7, then, because of the break keyword, Java will skip the rest of the 
	loop and move onto the rest of the code.

	If a is not equal to 7, then Java will print the value of a for us.*/