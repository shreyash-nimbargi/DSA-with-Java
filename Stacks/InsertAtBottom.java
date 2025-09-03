

import java.util.Stack;

public class InsertAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Stack : "+st);
        System.out.println("Element to be added is 6\n");
        
        
        st.push(6);
        System.out.println(st);
    }
}
