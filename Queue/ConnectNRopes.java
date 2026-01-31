//This code computes the minimum cost of connecting n ropes
import java.util.*;

public class ConnectNRopes {
    public static int minCost(int arr[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < arr.length; i++){
            pq.add(arr[i]);
        }

        int cost = 0;
        while(pq.size() > 1){
            int first = pq.poll();
            int second = pq.poll();
            cost += first + second;

            pq.add(first + second);
        }
        
        return cost;
    }

    public static void main(String args[]){
        int arr[] = {4,3,2,6};
        System.out.println(minCost(arr));
    }
}
