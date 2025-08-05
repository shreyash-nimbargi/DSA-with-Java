

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


        
    }

    public void addLast(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
            
        }
        temp.next = newNode;
    }

    //delete

    public void deleteFirst()
    {
        if(head == null)
        {
            System.out.println("the list is empty");
            return;
        }
        head = head.next;
    }

    //delete last

    public void deleteLast()
    {
        if(head == null)
        {
            System.out.println("this list is empty");
            return;
        }

        Node slast = head;
        Node last = head.next;
        while(last.next != null)
        {
            last = last.next;
            slast = slast.next;
        }
    }
    //print the elements

    public void printList()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("NULL");
    }

    

    public static void main(String[] args) {
        Linklist l = new Linklist();
        l.addFirst(2);
        l.addFirst(1);
        l.addLast(3);
        l.printList();
        l.deleteFirst();
        l.printList();
    }
}
