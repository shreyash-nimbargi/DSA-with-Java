import java.util.*;

public class Hassshh {
    public static void main(String[] args) {
        HashMap<String,Integer> hp = new HashMap<>();
        hp.put("Shreyash" ,10);
        hp.put("Vedant" ,40);
        hp.put("Om" ,30);
        System.out.println(hp);
        
        System.out.println(hp.containsKey("Shreyash"));

        Set<String> keys = hp.keySet();
        for (String k : keys) {
            System.out.println(k+" "+ hp.get(k) );
        }
    }
}
