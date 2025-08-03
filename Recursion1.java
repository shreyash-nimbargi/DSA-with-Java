public class Recursion1 {

    
    public static class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.next = n2;
        n2.next = n3;
        Node temp = n1;
        while(temp!= null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
