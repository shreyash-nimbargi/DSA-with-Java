import java.util.*;
public class New {
    public static void main(String[] args) {
        // Stack<Integer> st = new Stack<>();
        // st.push(4);
        // st.push(5);
        // System.out.println(st.pop());

        Queue<Integer> q = new LinkedList<>(); {
            q.add(2);
            q.add(3);
            System.out.println(q.poll());
        }
    }
}
