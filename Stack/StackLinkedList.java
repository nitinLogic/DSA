//This code implements stck using linked list
import java.util.*;

public class StackLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack{
        static Node head = null;

        static boolean isEmpty(){
            return head == null;
        }

        //push
        static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        //pop
        static int pop(){
            if(isEmpty()){
                return -1;
            }
            int val = head.data;
            head = head.next;

            return val;
        }

        //peek
        static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]){
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        while(!st.isEmpty()){
            System.out.print(st.peek() + " ");
            st.pop();
        }
    }
}
