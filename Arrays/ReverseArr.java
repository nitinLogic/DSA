//This code reverses an array in constant space
import java.util.*;

public class ReverseArr {

    public static void revArr(int nums[]){
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            //Swap array element at extreme ends
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;    //Shift start to right by one step
            end--;      //Shift end to left by one step
        }
    }

    public static void main(String args[]){
        int nums[] = {2, -4, 6, 8, 0};
        
        System.out.print("Original array: ");
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();;
        
        revArr(nums);
        
        System.out.print("Reverse array:  ");
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
