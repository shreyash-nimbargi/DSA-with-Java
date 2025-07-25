

public class funtions {
    public static void main(String[] args) {
        String firstName = "Shreyash";
        String lastName = "Nimbargi";
        String fullName = firstName + " " +lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());

        for(int i = 0;i<fullName.length();i++)
        {
            System.out.print(fullName.charAt(i));
        }
    }
}
