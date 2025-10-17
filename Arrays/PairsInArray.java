//This code prints all possible pairs in an given array (Brute Force Approach)
import java.util.*;

public class PairsInArray {
    public static void printPairs(int nums[]){
        int n = nums.length;
        int pairsCnt = 0;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
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