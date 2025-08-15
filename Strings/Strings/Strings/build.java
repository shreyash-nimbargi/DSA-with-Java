

public class build {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Shreyash Nimbargi");
        
        //charAt
        System.out.println(s.charAt(9));

        //set charAt index 0
        s.setCharAt(1, 'h');
        System.out.println(s);

        //insert 

        s.insert(0,'i');
        System.out.println(s);

        //delete the extra I
        s.delete(0, 1);
        System.out.println(s);

        //append
        s.append(" ");
        s.append("H");
        s.append("E");
        s.append("Y");
    }    
}
