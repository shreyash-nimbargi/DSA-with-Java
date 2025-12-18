import java.util.*;

public class hash {
    public static void map()
    {
         HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Mumbai",100);
        hm.put("Pune",10);
        hm.put("Solapur",300);
        hm.put("Nashik",140);
    

        Set<String> keys = hm.keySet();
        System.out.println(keys);
    }
    public static void set()
    {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(50);
        hs.add(20);
        hs.add(190);
        System.out.println(hs);
    }
    public static void main(String[] args) {
       map();
       set();
    }    
  
}
