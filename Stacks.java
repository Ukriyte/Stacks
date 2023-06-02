import java.util.*;

public class Stacks{

    static class Stack1{
        //Using ArrayLists
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
            int data = list.get(list.size()-1);
            list.remove(list.size()-1);
            return data;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }

    static class Node{ 
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    static class Stack2{
        //Using LinkedList
        static Node head = null;
        static boolean isEmpty(){
            return head==null;
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
            int ans = head.data;
            head = head.next;
            return ans;
        }

        public static int peek(){
            return head.data;
        }
    }
    //LIFO Data Structure
    //Operations
    //1. Push O(1) 
    //2. Pop O(1)
    //3. Peek-O(1)
    public static void main(String[] args) {

        //Implementation using Arraylist
        Stack1 s1 = new Stack1();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        while(s1.isEmpty()!=true){
            System.out.print(s1.pop()+" ");
            //s1.pop();
        }
        System.out.println();
        //Implementation using LinkedList
        Stack2 s2 = new Stack2();
        s2.push(1);
        s2.push(2);
        s2.push(3);
        while(s2.isEmpty()!=true){
            System.out.print(s2.pop()+" ");
            //s2.pop();
        }
        System.out.println();
        //Using JCF Stacks
        Stack<Integer> s3 = new Stack<>();
        s3.push(1);
        s3.push(2);
        s3.push(3);
        while(s3.isEmpty()!=true){
            System.out.print(s3.pop()+" ");
            //s3.pop();
        }
    }
}