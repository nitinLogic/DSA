//This is an implementation of Quick Sort on given array
import java.util.*;

public class QuickSort {
     public static void printArr(int a[]){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void quickSort(int a[], int si, int ei){
        //Base case
        if(si >= ei){
            return;
        }

        int pIdx = partition(a, si, ei);
        quickSort(a, si, pIdx - 1);     //Left part
        quickSort(a, pIdx + 1, ei);     //Right part
        return;
    }

    public static int partition(int a[], int si, int ei){
        int pivot = a[ei];
        int i = si - 1;

        for(int j = si; j < ei; j++){
            if(a[j] <= pivot){
                i++;
                //swap
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        i++;
        a[ei] = a[i];
        a[i] = pivot;
        
        return i;
    }

    public static void main(String args[]){
        int a[] = {6, 3, 9, 8, 2, 5};
        quickSort(a, 0, a.length - 1);
        printArr(a);
    }
}
