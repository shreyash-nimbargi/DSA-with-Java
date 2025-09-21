

import java.util.*;
public class Hashing
{

    public static void  HashmapMethods()
    {
        HashMap<String,Integer>  mp = new HashMap<>();
        mp.put("Shreyash", 129); 
        mp.put("Vedant", 1229);
        mp.put("OM", 29);
        mp.put("Pratham", 1239);

        //getting the value of a key
        System.out.println(mp.get("Shreyash"));

        //Changing or updating the value
        mp.put("Om", 25);
        System.out.println(mp.get("Om"));

        //deleting the elements
        mp.remove("Om");
        System.out.println(mp.get("Om"));

        //checking the elements in the hashmap

        System.out.println(mp.containsKey("Shreyash"));

        //put value if not present in the hashmap
        if(!mp.containsKey("Nikhil"))
        {
            mp.put("Nikhil", 10);
            System.out.println(mp.get("Nikhil"));
        }
        
    }
    public static void main(String[] args) {
        HashmapMethods();
    }
}