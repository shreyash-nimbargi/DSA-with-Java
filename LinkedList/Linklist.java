

public class Linklist {
    Node head;

    public Linklist()
    {
        this.head = null;
    }

    //blueprint
    public class Node{
        int data;
        Node next;

        public Node(int data)
        {
             this.data = data;
             this.next = null;
        }

    }

    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;


        //print
    }
    public void printList()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.data+" -> ");
            temp = temp.next;
        }
    }

    

    public static void main(String[] args) {
        Linklist l = new Linklist();
        l.addFirst(2);
        l.addFirst(1);

        l.printList();
    }
}
