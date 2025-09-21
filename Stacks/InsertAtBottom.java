

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
        System.out.println("\nElement to be added is 6");
        
        
        st.push(6);
        System.out.println(st);

        System.out.println("Insert at any index : ");
        int idx = 2;
        int n = 12;
        Stack<Integer> temp = new Stack<>();
        while(st.size()>idx)
        {
            temp.push(st.pop());
            
        }
        st.push(n);
        while(temp.size()>0)
        {
            st.push(temp.pop());
        }

        System.out.println(st);
    }
}
