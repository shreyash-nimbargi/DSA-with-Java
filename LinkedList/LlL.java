
public class LlL {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(7);
        a.next = b;
        b.next = c;
        c.next = d;
        
        Node temp = a;
      while (temp!=null) {
        System.out.println(temp.data);
        temp= temp.next;
      }

    }
}
