

public class LL {
    Node head;

    public LL()
    {
        this.head = null;
    }
        
    private class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public  void addFirst(int  data)
    {
        Node newnode = new Node(data);
        if(head == null)
        {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
        
    }
    public void addLast(int data)
    {
        Node lastnode = new Node(data);
        if(head == null)
        {
            head = lastnode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null)
        {
            currNode = currNode.next;
        }
        currNode.next = lastnode;

    }
    public  void printList()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        LL l = new LL();
        l.addFirst(1);
        l.addFirst(2);
        l.addLast(3);
        l.addLast(4);
        l.printList();
    }
}
