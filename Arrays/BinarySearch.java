//This code finds the key in a sorted array using binary search
import java.util.*;

public class BinarySearch {

    public static int binSearch(int nums[], int key){
                int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;

            //Key is at the middle of array
            if(nums[mid] == key)
                return mid;
            //Key is in right subarray
            else if(nums[mid] < key)
                start = mid + 1;
            //Key is in left subarray
            else
                end = mid - 1;
        }

        return -1;  //Return -1 when key is not found
    }

    public static void main(String args[]){
        int nums[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;
        System.out.println("Key is at index: " + binSearch(nums, key));
    }
}
