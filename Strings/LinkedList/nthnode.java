public class nthnode {
    public class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(10);
        Node c = new Node(13);
        Node d = new Node(30);
        Node e = new Node(400);
        Node f = new Node(150);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

    }
}
