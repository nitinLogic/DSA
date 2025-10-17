//This code prints all possible subarrays in a given array (Brute Force)
import java.util.*;

public class SubArraysInArray {
    //Initialize subarray sums
    public static int maxSum = Integer.MIN_VALUE;
    public static int minSum = Integer.MAX_VALUE;


    //Function to print elements of a subarray
    public static void printSub(int nums[], int i, int j){
        int currSum = 0;

        System.out.print("(");
        for(int k = i; k <= j; k++){ 
            System.out.print(nums[k]);
            currSum += nums[k];
            if(k != j)
                System.out.print(",");
        }
        System.out.print(") ");

        //Update max & min subarray sums
        maxSum = Math.max(maxSum, currSum);
        minSum = Math.min(minSum, currSum);
    }

    public static void subArr(int nums[]){
        int subarrCnt = 0;     //Total count of subarrays
        int n = nums.length;

        for(int i = 0; i < n; i++){     //First element of subarray
            for(int j = i; j < n; j++){     //Last element of subarray
                printSub(nums, i, j);
                subarrCnt++;
            }      
            System.out.println();
        }

        System.out.println("Total Subarrays: " + subarrCnt);
    }

    public static void main(String args[]){
        int nums[] = {2, 4, 6, 8, 10};
        subArr(nums);
        System.out.println("Maximum subarray sum: " + maxSum);
        System.out.println("Minimum subarray sum: " + minSum);
    }
}
