//This code implements operations of a linked list
import java.util.*;

public class LinkedList_Operations {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //Add Node at first
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;

        //Empty ll
        if(head == null){
            head = newNode;
            tail = newNode;
            
            return;
        }

        newNode.next = head;
        head = newNode;
    }


    //Add node at last
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void print(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //Add node at given index
    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return ;
        }

        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;
        while(i < idx - 1 && temp != null){
            temp = temp.next;    
            i++;
        }

        //i = idx - 1
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void main(String args[]){
        LinkedList_Operations ll = new LinkedList_Operations();
        ll.print(head);
        ll.addFirst(2);
        ll.print(head);
        ll.addFirst(1);
        ll.print(head);
        ll.addLast(3);
        ll.print(head);
        ll.addLast(4);
        ll.print(head);
        ll.add(2, 9);
        ll.print(head);

        System.out.println("Linked List size: " + ll.size);
    }
}
