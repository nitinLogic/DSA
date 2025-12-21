//This code checks if a pair exist in a sorted array whose sum is equal to target
import java.util.*;

public class PairSum {
    //Two pointer approach - O(n)
    public static boolean checkSum_2Ptr(ArrayList<Integer> arr, int target){
        int lp = 0;
        int rp = arr.size() - 1;

        while(lp < rp){
            if(arr.get(lp) + arr.get(rp) == target)
                return true;
            else if(arr.get(lp) + arr.get(rp) < target)
                lp++;
            else
                rp--;
        }

        return false;
    }

    //Brute force approach - O(n^2)
    public static boolean checkSum_brute(ArrayList<Integer> arr, int target){
        for(int i = 0; i < arr.size(); i++){
            for(int j = i + 1; j < arr.size(); j++){
                if(arr.get(i) + arr.get(j) == target)
                    return true;
            }
        }

        return false;
    }

    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        
        int target = 5;

        System.out.println(checkSum_brute(arr, target));
        System.out.println(checkSum_2Ptr(arr, target));
    }
}
