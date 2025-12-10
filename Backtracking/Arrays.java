//This code recursively fills an empty array & reduces each element by 2 while backtracking
import java.util.*;

public class Arrays {
    public static void backtrack(int a[], int idx){
        //Base case
        if(idx >= a.length){
            printArr(a);
            return;
        }

        a[idx] = idx + 1;
        backtrack(a, idx + 1);
        a[idx] -= 2;

        return;
    }

    public static void printArr(int a[]){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.print("\n");
    }

    public static void main(String args[]){
        int a[] = new int[5];
        backtrack(a, 0);
        printArr(a);
    }
}