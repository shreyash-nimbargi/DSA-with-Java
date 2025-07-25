

public class build {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Shreyash Nimbargi");
        
        //charAt
        System.out.println(s.charAt(9));

        //set charAt index 0
        s.setCharAt(0, 'I');
        System.out.println(s);
    }    
}
