//This code detects cycle & removes it from a linked list
import java.util.*;

public class CycleLL {
    public class Node{
        int data;
        Node next;

        public Node(int data){
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
        return;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public boolean detectCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }

    public void removeCycle(){
        //Detect cycle
        boolean cycle = false;
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                cycle = true;
                break;
            }
        }

        if(!cycle){
            return;
        }

        //Find the last node
        slow = head;
        Node prev = null;

        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //Last.next = null
        prev.next = null;

        return;
    }

    public static void main(String args[]){
        CycleLL ll = new CycleLL();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        ll.print();

        //Create cycle
        Node temp = head.next.next; //temp is pointing at 3
        temp.next.next.next.next = temp;

        System.out.println(ll.detectCycle());
        ll.removeCycle();
        System.out.println(ll.detectCycle());
    }
}