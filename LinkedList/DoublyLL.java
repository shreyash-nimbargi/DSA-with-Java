
public class DoublyLL {
    Node head;

    public DoublyLL()
    {
        this.head = null;
    }
    public  void insertNode(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;
        if(head != null)
        {
             head.prev = newNode;
        }
       
       head = newNode;
    }

    public  void display()
    {
        
        Node temp = head;
        System.out.print("NULL <-> ");
        while(temp != null)
        {
            System.out.print(temp.data+" <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data)
        {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    } 
    public static void main(String[] args) {
        DoublyLL l = new DoublyLL();
        l.insertNode(3);
        l.insertNode(2);
        l.insertNode(1);
        l.insertNode(0);
        l.display();
    }
}
