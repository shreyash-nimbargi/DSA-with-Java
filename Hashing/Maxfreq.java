import java.util.HashMap;

public class Maxfreq {
    public static void main(String[] args) {
        
        int[] arr = {1,2,1,3,4,5,4,5,5,6,6,7};
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int el : arr)
        {
            if(!freq.containsKey(el))
            {
                freq.put(el, 1);
            }
            else
            {
                freq.put(el);
            }
        }
    }
}
