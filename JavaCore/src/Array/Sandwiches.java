package Array;
import java.util.ArrayList;
import java.util.List;

public class Sandwiches {
    public static void main(String[] args){
        List<String> sandwiches = new ArrayList<>();
        sandwiches.add("bread sandwich");
        sandwiches.add("pop tart");
        sandwiches.add("hot dog");

        System.out.println(sandwiches);
        System.out.println(sandwiches.get(0));
        
        sandwiches.set(0, "ice cream taco");
        System.out.println(sandwiches);
        
        sandwiches.remove(0);
        System.out.println(sandwiches);

        sandwiches.size();

        sandwiches.clear();
        System.out.println(sandwiches);
    }
}
/*above ADD-adds elementsinto the Sandwiches Array List
above GET-gets bread sandwich 
above SET-sets to ice cream taco/modifies it

      above remove/size/clear - 
*/        