//This code prints all indexes where the key occurs in a given array using recursion
import java.util.*;

public class AllOccur {
    public static void allOccurrences(int a[], int key, int idx){
        //Base case
        if(idx == a.length){
            return;
        }

        if(a[idx] == key){
            System.out.print(idx + " ");
        }
        //Function call
        allOccurrences(a, key, idx + 1);
    }
    public static void main(String args[]){
        int a[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        allOccurrences(a, key, 0);
    }
}
