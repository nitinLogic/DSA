//This code reverses first k elements of a queue
import java.util.*;

public class ReverseFirstKQueue {
    public static void reverseK(Queue<Integer> q, int k){
        int n = q.size();

        Stack<Integer> s = new Stack<>();
        //Push first k elements into stack
        for(int i = 0; i < k; i++){
            s.push(q.remove());
        }

        //Add stack elements into queue
        while(!s.isEmpty()){
            q.add(s.pop());
        }

        //Add first n - k elements of current queue at last
        for(int i = 0; i < n - k; i++){
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

        int k = 3;
        reverseK(q, k);

        while(!q.isEmpty()){
            System.out.println(q.remove() + " ");
        }
    }
}
