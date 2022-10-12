package Iteration;
//QA Community example
public class Iteration4 {

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            if(i == 2) {
                continue;
            }
            if(i == 7) {
                break;
            }
            System.out.println(i); 
            } 
        } 
    }
/*
 
Transfer and Control Statements
We can manipulate the flow of code through a number of keywords:

Break: Break statements break out of the current code block, in loops this means that Java will skip the rest of the loop and move onto executing the rest of the code.
Continue: Continue statements break out of the current iteration of a code block, in loops this means that Java will skip the current iteration of the code block and move onto the next.
Return: Return statements are used in methods to return values according to the methods return type, ending the method.
public class Iteration {

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            if(i == 2) {
                continue;
            }
            if(i == 7) {
                break;
            }
            System.out.println(i);
        }
    }
}
In the above example we are running a for()-loop starting with i = 0, with the condition i < 10, and incrementing i by 1 after each iteration.

Each iteration will run the first if()-statement and check if i is equal to 2.

If it is, then because of the continue keyword Java will skip this iteration and move onto the next one.

If i is not equal to 2, then the iteration will move onto the second if()-statement and check if i is equal to 7.

If i does equal 7, then, because of the break keyword, Java will skip the rest of the loop and move onto the rest of the code.

If i is not equal to 7, then Java will print the value of i for us.


 /
 */