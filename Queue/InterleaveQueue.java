//This code interleaves two half of a queue
import java.util.*;

public class InterleaveQueue {
    public static void interleave(Queue<Integer> q){
        int size = q.size();    //Size of queue changes in the loop, so saved
        
        //Save first half in separate queue 
        Queue<Integer> firstHalf = new LinkedList<>();
        for(int i = 0; i < size / 2; i++){
            firstHalf.add(q.remove());
        }

        //Interleaving
        while(!firstHalf.isEmpty()){
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }
    
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interleave(q);

        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
    }
}
