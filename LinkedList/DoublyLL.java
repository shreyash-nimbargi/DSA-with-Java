public class DoublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }
    public static Node head;
    public static Node tail;
    public static Node size;

    //add

    public void add(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = tail = newNode;
        }
        
        
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void print()
    {
        Node temp = head;
        while(temp!= null)
        {
            if(temp.next == null)
            {
                System.out.println(temp);
                return;
            }
            System.out.println(temp+" <-> ");
            temp = temp.next;
            
        }
    }
    public static void main(String[] args) {
        DoublyLL ll = new DoublyLL();
        ll.add(3);
        ll.add(4);
        ll.print();
    }
}
