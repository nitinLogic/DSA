//This code implements merge sort on a linked list
import java.util.*;

public class MergeSortLL{
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

    public void addFirst(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
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

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private Node merge(Node left, Node right){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while(left != null && right != null){
            if(left.data < right.data){
                temp.next = left;
                left = left.next;
                temp = temp.next;
            }
            else{
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }
        }

        while(left != null){
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }
        while(right != null){
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }

        return mergeLL.next;
    }

    public Node mergeSort(Node head){
        //Base case
        if(head == null || head.next == null){
            return head;
        }

        //Find mid
        Node mid = findMid(head);
        Node temp = mid.next;
        mid.next = null;

        //Sort left & right
        Node left = mergeSort(head);
        Node right = mergeSort(temp);

        //Merge
        return merge(left, right);
    }

    public static void main(String args[]){
        MergeSortLL ll = new MergeSortLL();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        ll.print();
        ll.head = ll.mergeSort(ll.head);
        ll.print();
    }
}