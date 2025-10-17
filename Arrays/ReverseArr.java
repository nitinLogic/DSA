//This code reverses an array
import java.util.*;

public class ReverseArr {

    public static void revArr(int nums[]){
        int start = 0;
        int end = nums.length - 1;

        //Swap array element at extreme ends
        while(start <= end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
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
