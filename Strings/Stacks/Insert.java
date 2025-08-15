import java.util.*;
public class Insert {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        int index = 2;
        int num = 13;
        Stack<Integer> temp = new Stack<>();
        while(st.size()>2)
        {
            temp.push(st.pop());
        }
        st.push(num);

        while(temp.size()>0)
        {
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}
