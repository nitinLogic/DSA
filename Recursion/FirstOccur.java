//This code prints index of first occurrence of given integer in an array
import java.util.*;

public class FirstOccur {
    public static int first(int a[], int key, int i){
        //Item not present in the array
        if(i >= a.length)
            return -1;

        //Found
        if(a[i] == key)
            return i;
        return first(a, key, i + 1);
    }

    public static void main(String args[]){
        int a[] = {2, 4, 5, 6, 8, 9, 2, 5};
        int n = 5;
        System.out.println("n first occures at index: " + first(a, n, 0));
    }
}
