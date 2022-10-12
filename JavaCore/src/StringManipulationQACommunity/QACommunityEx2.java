package StringManipulationQACommunity;

public class QACommunityEx2 {

}


/*For this task you are to implement 4 methods that manipulate String objects. For all parts of this section you are only 
allowed to use the 
length(), 
substring(), and 
equals() methods. 

Avoid using arrays or any methods you have yet to be taught 
as this defeats the purpose of the exercise:

Method 1 - When given a String, count and return how many words there are in that String.
Method 2 - When given a String, print out this String in a vertical fashion, each word on a different line.
Method 3 - When given a String, print out this String in a vertical fashion in reverse order, each word on a different line.
Method 4 - A find method, which takes 2 Strings; the first is message and the second is the String you want to find in the message. 
A boolean value should be returned to indicate whether or not the second String has been found in the message.


*/

//STRING LEEEENGTHHHH

package StringManipulationQACommunity;

public class StringDemo4 {


  public static void main(String args[]) {
      String myStr = "I like many strings";
      int stringLength = myStr.length();
      System.out.println("String Length is " + stringLength);
      // output will be: String Length is 19
  }
}