package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Runner {
    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<>();

        people.put("Nick", 25);
        people.put("Jordan", 26);
        people.put("John", 33);

        for (Entry<String, Integer> i : people.entrySet()) {
            System.out.println(i);
        }
    }
}