//This code searches a key in a linked list both iteratively & recursively
import java.util.*;

public class LinkedList_Search {
    public class Node{
        int data;
        Node next;

        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addLast(int data){
        Node newNode = new Node(data);

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

    //Iterative search
    public static int itrSearch(int key){
        Node temp = head;
        int idx = 0;
        while(temp != null){
            if(temp.data == key)
                return idx;
            temp = temp.next;
            idx++;
        }

        return -1;
    }


    //Recursive search
    public static int helper(Node head, int key){
        //Base case
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }

        return idx + 1;
    }

    public static int recSearch(int key){
        return helper(head, key);
    }

    public static void main(String args[]){
        LinkedList_Search ll = new LinkedList_Search();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.print(head);

        System.out.println(itrSearch(3));
        System.out.println(itrSearch(13));

        System.out.println(recSearch(3));
        System.out.println(recSearch(13));
    }
}
