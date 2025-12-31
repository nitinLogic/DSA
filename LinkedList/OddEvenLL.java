//This code modifies a liked list such that all even numbers 
// appear before all odd number
import java.util.*;

public class OddEvenLL {
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

    public void seggregateOddEven(){
        if(head == null || head.next == null)
            return;
        Node evenHead = new Node(-1);
        Node oddHead = new Node(-1);
        Node evenTail = evenHead;
        Node oddTail = oddHead;

        Node temp = head;
        while(temp != null){
            if(temp.data % 2 == 0){
                evenTail.next = temp;
                evenTail = temp;
            }
            else{
                oddTail.next = temp;
                oddTail = temp;
            }

            temp = temp.next;
        }
        oddTail.next = null;
        evenTail.next = oddHead.next;

        head = evenHead.next;
    }

    public static void main(String args[]){
        OddEvenLL ll = new OddEvenLL();

        ll.addLast(8);
        ll.addLast(12);
        ll.addLast(10);
        ll.addLast(5);
        ll.addLast(4);
        ll.addLast(1);
        ll.addLast(6);
        ll.print();

        ll.seggregateOddEven();
        ll.print();
    }
}
