import java.util.*;
public class maxsize{
    public static int size;
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }


    }

    public static void preorder(Node root)
    {
        if(root == null) return;
    //    System.out.print(root.data+" -> ");
    //     if(root.left !=null) System.out.print(root.left.data+" , "); 
    //     else System.out.print("null ,");
    //     if(root.right !=null)System.out.print(root.right.data);
    //     else System.out.print("null");
        size++ ;
        

        preorder(root.left);
        preorder(root.right);
    }

    
    public static void main(String[] args) {
         Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(7);

        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = f;
        b.right = e;

        preorder(root);
        System.out.println(size);
        System.out.println("Height = "+height(root));
    }
}