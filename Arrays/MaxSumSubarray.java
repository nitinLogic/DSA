//This code calculates maximum sum of a subarray using Prefix sum as well as Kadane's algorithm
import java.util.*;

public class MaxSumSubarray {   
    //Kadane's Algorithm
    public static void maxSubarray_Kadane(int nums[]){
        int n = nums.length;

        //Edge case of all negative numbers
        boolean allNeg = true;
        int maxNum = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(nums[i] >= 0){
                allNeg = false;
                break;
            }
            maxNum = Math.max(maxNum, nums[i]);
        }
        if(allNeg)
            System.out.println("Maximum subarray sum by Kadane's Algorithm: " + maxNum);
        else{
            int curSum = 0;
            int maxSum = Integer.MIN_VALUE;

            for(int i = 0; i < n; i++){
                curSum += nums[i];
                if(curSum < 0)
                    curSum = 0;
                maxSum = Math.max(maxSum, curSum);
            }

            System.out.println("Maximum subarray sum by Kadane's Algorithm: " + maxSum);
        }
    }

    //Prefix sum Algorithm
    public static void maxSubarray_PrefixSum(int nums[]){
        int n = nums.length;
        
        //Create the prefix sum array
        int prefix[] = new int[n];
        for(int i = 0; i < n; i++){
            prefix[i] = (i == 0 ? nums[i] : prefix[i - 1] + nums[i]);
        }

        int curSum = 0;
        int maxSum = 0;
        for(int start = 0; start < n; start++){
            for(int end = start; end < n; end++){
                curSum = (start == 0 ? prefix[end] : prefix[end] - prefix[start - 1]);
                maxSum = Math.max(maxSum, curSum);
            }
        }

        System.out.println("Maximum subarray sum by Prefix Sum: " + maxSum);
    }

    public static void main(String args[]){
        int nums[] = {1, -2, 6, -1, 3};
        maxSubarray_PrefixSum(nums);
        maxSubarray_Kadane(nums);
    }
}
