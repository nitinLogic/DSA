//This code checks if a pair exist in a sorted rotated array whose sum is equal to target
import java.util.*;

public class PairSum_2 {
    public static boolean checkSum_2Ptr(ArrayList<Integer> arr, int target){
        int n = arr.size();

        //Find the pivot point
        int pivot = -1;
        for(int i = 0; i < arr.size() - 1; i++){
            if(arr.get(i) > arr.get(i + 1)){
                pivot = i;
                break;
            }
        }

        int lp = pivot + 1;
        int rp = pivot;

        while(lp != rp){
            //Case 1
            if(arr.get(lp) + arr.get(rp) == target)
                return true;

            //Case 2
            else if(arr.get(lp) + arr.get(rp) < target)
                lp = (lp + 1) % n;

            //Case 3
            else
                rp = (n + rp - 1) % n;
        }

        return false;   //No such pair exist
    }

    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(11);
        arr.add(15);
        arr.add(6);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        int target = 16;

        System.out.println(checkSum_2Ptr(arr, target));
    }
}
