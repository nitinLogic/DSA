//This code swaps nodes at two given values in a linked list
//Assume that all values are distinct
import java.util.*;

public class SwapNodesLL {
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

    public void swapNodes(int x, int y){
        //Both nodes are same
        if(x == y)
            return;

        //Find nodes x & y keeping track of previous nodes
        Node prevX = null;
        Node currX = head;
        while(currX != null && currX.data != x){
            prevX = currX;
            currX = currX.next;
        }

        Node prevY = null;
        Node currY = head;
        while(currY != null && currY.data != y){
            prevY = currY;
            currY = currY.next;
        }
        
        //In case x or y doesn't exist on linked list
        if(currX == null || currY == null)
            return;

        //x is the head node
        if(prevX == null){
            head = currY;
        }
        else{
            prevX.next = currY;
        }

        //y is the head
        if(prevY == null){
            head = currX;
        }
        else{
            prevY.next = currX;
        }

        Node temp = currY.next;
        currY.next = currX.next;
        currX.next = temp;

        return;
    }

    public static void main(String args[]){
        SwapNodesLL ll = new SwapNodesLL();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();

        int x = 2, y = 4;
        ll.swapNodes(x,y);
        ll.print();
    }
}
