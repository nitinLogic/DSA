//This function checks if any element is repeated atleast twice in an integer array
import java.util.*;

public class RepeatingElement{
    public static boolean checkRepeatition(int nums[]){
        Arrays.sort(nums);

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1])
                return true;
        }

        return false;
    }
    public static void main(String args[]){
        int nums[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(checkRepeatition(nums));
    }
}