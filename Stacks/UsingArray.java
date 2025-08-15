

public class UsingArray {
    public static class Stack{
        int[] arr = new int[5];
            int idx = 0;

    //push        
        public void push(int data)
        {
            arr[idx] = data;
            idx++;

        }

    //pop
        public int pop()
        {
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }
        public void display()
        {
            for(int i = 0;i<=idx-1;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        
        Stack s = new Stack();
        s.push(2);
        s.push(3);
        s.push(4); 
        
        s.display();
        s.pop();
        s.display();
    }
}
