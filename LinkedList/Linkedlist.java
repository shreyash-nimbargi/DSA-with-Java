
public class Linkedlist {
    public static class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size;
        public void addFirst(int data)
        {
            
            Node newNode = new Node(data); 
            size++;
            if(head == null)
            {
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
            
        }
    
        public void addLast(int data)
        {
            Node newNode = new Node(data);
            size++;
            if(head == null)
            {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
            

        }

        public void printnode()
        {
            
            Node temp = head;
            if(head == null)
            {
                System.out.print(head);
                return;
            }
            while(temp!=null)
            {
                System.out.print(temp.data+ " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }

        public  void insertNode(int idx,int data)
        {
            Node newNode = new Node(data);
            size++;
            Node temp = head;

            int i = 0;
            while(i<idx-1)
            {
                temp = temp.next;
                i++;
                
            }

            newNode.next = temp.next;
            temp.next = newNode;
        }
        public int search(int key)
        {
            int i = 0;
            Node temp = head;
            while(temp!=null)
            {
                if(temp.data == key)
                {

                   return i;
                }
                temp = temp.next;
                i++;
            }
            return -1;
        }
        public void removefirst()
        {
            if(head == null)
            {
                System.out.println(head);
                return;
            }
            head = head.next;
        }

        public void cycle()
        {
            Node slow = head;
            Node fast = head;

            while(fast != null && fast.next != null)
            {
                
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast)
                {
                    System.out.println("Cycle detected");
                    return;
                } 
                else System.out.println("NO");
            }



        }

    public static void main(String[] args) {
    Linkedlist ll = new Linkedlist();
    ll.addFirst(1);
    ll.printnode();
    ll.addFirst(2);
    ll.printnode();
    ll.addLast(6);
        ll.printnode();
        ll.insertNode(1, 55);
        ll.printnode();
    System.out.println(ll.size);
    ll.removefirst();
    ll.printnode();
    ll.search(6);
    ll.cycle();
}
}
