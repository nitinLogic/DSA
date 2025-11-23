//This code checks if an array is sorted using Recursion
import java.util.*;

public class SortedArr {
    public static boolean isSorted(int a[], int i){
        //Base case
        if(i == a.length - 1)
            return true;
        
        if(a[i] > a[i + 1])
            return false;
        return isSorted(a, i + 1);
    }

    public static void main(String args[]){
        int a[] = {1, 3, 5, 17, 10};
        System.out.println(isSorted(a, 0));
    }
}