//This code prints all possible pairs in an given array (Brute Force Approach)
import java.util.*;

public class PairsInArray {
    public static void printPairs(int nums[]){
        int n = nums.length;
        int pairsCnt = 0;   //Total number of possible pairs

        for(int i = 0; i < n - 1; i++){     //First element of each pair
            for(int j = i + 1; j < n; j++){     //Second element of each pair
                System.out.print("(" + nums[i] + "," + nums[j] + ")" + " ");
                pairsCnt++;
            }
            System.out.println();
        }

        System.out.println("Total pairs: " + pairsCnt);
    }
    public static void main(String args[]){
        int nums[] = {2, 4, 6, 8, 10};
        printPairs(nums);
    }
}