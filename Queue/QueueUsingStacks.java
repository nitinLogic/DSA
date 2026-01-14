//This code implements Queue using two stacks
//Add - O(n)
//Remove, peek - O(1)
import java.util.*;

public class QueueUsingStacks{
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        //Is empty
        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        //Add
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        //Remove
        public static int remove(){
            if(s1.isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }

            int top = s1.pop();
            return top;
        }

        //Peek
        public static int peek(){
            if(s1.isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }

            return s1.peek();
        }

    }

    public static void main(String args[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}