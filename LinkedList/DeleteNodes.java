//This code deletes n nodes after m nodes in a linked list
import java.util.*;

public class DeleteNodes {
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

    //Add node at last
    public void addLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void print(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void deleteNode(int n, int m){
        if(head == null){
            System.out.println("Empty list");
            return;
        }

        if(head.next == null){
            head = null;
        }

        Node temp = head;
        Node prev = null;
        for(int i = 0; i < m; i++){
            prev = temp;
            temp = temp.next;
        }

        for(int i = 0; i < n; i++){
            temp = temp.next;
        }

        prev.next = temp;
    }
    public static void main(String args[]){
        DeleteNodes ll = new DeleteNodes();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.print();

        int m = 3;
        int n = 2;
        ll.deleteNode(n, m);
        ll.print();
    }
}
