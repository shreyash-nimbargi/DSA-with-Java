
public class DoublyLL {
    private Node head;
    private int size;
    public DoublyLL()
    {
        this.head = null;
    }
    public  void insertNode(int data)
    {
        Node newNode = new Node(data);
        size++;
        newNode.next = head;
        newNode.prev = null;
        if(head != null)
        {
             head.prev = newNode;
        }
       
       head = newNode;
    }
    //insert at middle

    public void insertin(int data)
    {
        Node temp = head;
        if(temp == null)
        {
            return;
        }
        Node newNode = new Node(data);
        size++;
        while(temp != null)
        {
            if(temp.data == data)
            {
               temp.next = newNode;
               newNode.prev = temp;

               if(temp.next != null)
               {
                newNode.next = temp.next.next;
                temp.next.next = newNode;
               }
            }
            temp = temp.next;
        }
    }
    //insert

    public void insertLast(int data)
    {
        Node newNode = new Node(data);
        size++;
        if(head == null)   //edge case
        {
            head = newNode;
            newNode.prev = null;
            return;
        }
        Node last = head;
        while(last.next != null)
        {
            last = last.next;

        }
        last.next = newNode;
        newNode.prev = last;
    }

    //reverse the ll

    public void displayrev()
    {
        //traverse till last
       Node temp = head;

       if(temp == null)
       {
        System.out.println("Empty");
        return;
       }
       while(temp.next != null)
       {
        temp = temp.next;
        
       }
       //temp is at last

       //print it in reverse

       System.out.println("NULL <-> ");

       while(temp !=null)
       {
        System.out.print(temp.data+" <-> ");
        temp = temp.prev;
       }
       
    }

    //remove duplicates

    public void duplicates()
    {
        Node node = head;
        
        while(node.next != null)
        {
            if(node.data == node.next.data)
            {
                node.next = node.next.next;
                size--;
            }
            else{
                node = node.next;
            }
        }
    }
    //display

    public  void display()
    {
        System.out.println();
        System.out.println("***** LINKED LIST *****");
        System.out.println();
        Node temp = head;
        System.out.print("NULL <-> ");
        while(temp != null)
        {
            System.out.print(temp.data+" <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
        System.out.println("Size = "+size);
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
        l.insertNode(1);
        l.insertNode(1);
        l.insertNode(0);
        l.insertLast(23);
        
        
        l.duplicates();
        l.display();
        l.displayrev();
    }
}
