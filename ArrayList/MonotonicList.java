//This code checks if an arraylist is monotonic (increasing or decreasing) or not
import java.util.*;

public class MonotonicList {
    public static boolean isMonotonic(ArrayList<Integer> nums){
        boolean mIncreasing = true;
        boolean mDecreasing = true;

        //Increasing check
        for(int i = 0; i < nums.size() - 1; i++){
            if(nums.get(i) > nums.get(i + 1)){
                mIncreasing = false;
                break;
            }
        }


        //Decreasing check
        for(int i = 0; i < nums.size() - 1; i++){
            if(nums.get(i) < nums.get(i + 1)){
                mDecreasing = false;
                break;
            }
        }

        return mIncreasing || mDecreasing;
    }

    public static void main(String args[]){
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(3);

        System.out.println(isMonotonic(nums));
    }
}
