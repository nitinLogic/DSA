//This code finds the maximum of every window (k size) in a given array (n size)
import java.util.*;

public class SlidingWindowMax {
    public static void slidingWindowMax(int nums[], int k){
        int n = nums.length;

        Deque<Integer> dq = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        //0 to k
        for(int i = 0; i < k ; i++){
            //Remove element smaller than current (Descending queue)
            while(dq.size() > 0 && nums[dq.getLast()] <= nums[i]){
                dq.removeLast();
            }
            dq.addLast(i);
        }

        //k to n
        for(int i = k; i < n; i++){
            
            //1st element of queue is answer
            ans.add(nums[dq.getFirst()]);

            //Remove element not present in the current window
            while(dq.size() > 0 && dq.getFirst() <= (i - k)){
                dq.removeFirst();
            }

            //Remove element smaller than current (Descending queue)
            while(dq.size() > 0 && nums[dq.getLast()] <= nums[i]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        ans.add(nums[dq.getFirst()]);
        
        //Print ans
        for(int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,1,4,5,2,3,6};
        int k = 3;
        slidingWindowMax(arr, k);
    }
}
