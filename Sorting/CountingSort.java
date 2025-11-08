//This code does counting sort of integer array
import java.util.*;

public class CountingSort{
    public static void countingSort(int a[]){
        int large = Integer.MIN_VALUE;
        for(int i = 0; i < a.length; i++){
            large = Math.max(large, a[i]);
        }

        int count[] = new int[large + 1];
        for(int i = 0; i < a.length; i++){
            count[a[i]]++;
        }

        //Sorting
        int j = 0;
        for(int i = 0; i < count.length; i++){
            while(count[i] > 0){
                a[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int a[]){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String args[]){
        int a[] = {1, 4, 1, 3, 2, 7, 3};
        countingSort(a);
        printArr(a);
    }
}