
//Creating a string through arrays

package StringManipulationQACommunity;

public class StringDemo3 {

    public static void main(String args[]) {
     char[] helloArray = { 'H', 'e', 'l', 'l', 'o', 'P' }; // an array of chars
     String helloString = new String(helloArray);  
     System.out.println(helloString); // prints out HelloP
  }
}