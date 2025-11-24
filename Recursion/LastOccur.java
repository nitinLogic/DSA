//This code computes index of last occurrence of an element in array using Recursion
import java.util.*;

public class LastOccur {
    public static int last(int a[], int key, int i){
        //Base case
        if(i >= a.length){
            return -1;
        }
        
        int isFound = last(a, key, i + 1);
        if(isFound != -1){
            return isFound;
        }

        //Check Self
        if(a[i] == key){
            return i;
        }

        return isFound;
    }

    public static void main(String args[]){
        int a[] = {2, 4, 5, 6, 8, 9, 2, 5};
        int key = 2;
        System.out.println("n last occures at index: " + last(a, key, 0));
    }
}