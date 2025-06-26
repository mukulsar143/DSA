import java.util.*;

public class StackClass{
    
    // Stack mplementation using LL
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    static class StackLL{
        public static Node head;
        public static boolean isEmpty(){
            return head == null;
        }
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    
    // Stack Implementation using ArrayLists
    static class StackAL{
        static ArrayList<Integer> list = new ArrayList<>();
        
        public static boolean isEmpty(){
            return list.size() == 0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
        
    }
    // push element in bottom of the stack
    public static void pushBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushBottom(data, s);
        s.push(top);
    }
    
    // reverse Stack
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushBottom(top, s);
    }
    public static void main(String args[]){
        // print stack using ArrayList
        System.out.println("Stack Implementaion Using ArrayList# ");
        StackAL as = new StackAL();
        as.push(3);
        as.push(6);
        as.push(9);
        
        while(!as.isEmpty()){
             System.out.println(as.peek());
             as.pop();
        }
        
        // print Stack using LL
        System.out.println("Stack Implementaion Using LL# ");
        StackLL ls  = new StackLL();
        ls.push(5);
        ls.push(5);
        ls.push(5);
        while(!ls.isEmpty()){
             System.out.println(ls.peek());
             ls.pop();
        }
        
        // Stack Implementaion using Stack Collection Framework
        System.out.println("Stack Implementaion Using Stack Collection Framework# ");
        Stack<Integer> cs = new Stack<Integer>();
        cs.push(1);
        cs.push(2);
        cs.push(3);
        cs.push(5);
        reverseStack(cs);
        pushBottom(5, cs);

        int count = 1;
        while(!cs.isEmpty()){
             System.out.print(count++);
             System.out.println(".+cs.peek());
             cs.pop();
        }
    }
}

