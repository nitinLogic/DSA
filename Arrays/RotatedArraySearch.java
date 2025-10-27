//This code searchs target integer into a sorted rotated array
import java.util.*;

public class RotatedArraySearch {
    public static int rotatedArray(int nums[], int target){
        int n = nums.length;

        int start = 0, end = n - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            //Target is at index mid
            if(nums[mid] == target)
                return mid;
            else if(nums[start] <= nums[mid]){  //Left sorted
                //Binary search on left subarray
                if(nums[start] <= target && target <= nums[mid])
                    end = mid - 1;
                else    //Binary search on right subarray
                    start = mid + 1;
            }
            else{   //Right sorted. Binary search on right subarray
                if(nums[mid] <= target && target <= nums[end])
                    start = mid + 1;
                else    //Binary search on left subarray
                    end = mid - 1;
            }
        } 

        return -1;  //target not found
    }
    public static void main(String args[]){
        int nums[] = {3, 4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(rotatedArray(nums, target));
    }
}
