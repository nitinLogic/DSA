//This is an implementation of Merge Sort
import java.util.*;

public class MergeSort {
    public static void printArr(int a[]){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void merge(int a[], int si, int mid, int ei){
        int temp[] = new int[ei - si + 1];  //Temporary array
        
        int i = si;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= ei){
            if(a[i] < a[j]){
                temp[k++] = a[i++];
            }
            else{
                temp[k++] = a[j++];
            }
        }

        while(i <= mid){
            temp[k++] = a[i++];
        }

        while(j <= ei){
            temp[k++] = a[j++];
        }

        //Copy merged array into original array
        for(k = 0, i = si; k < temp.length; k++, i++){
            a[i] = temp[k];
        }
    }

    public static void mergeSort(int a[], int si, int ei){
        //Base case
        if(si >= ei){
            return;
        }
        
        //Kaam
        int mid = si + (ei - si) / 2;
        mergeSort(a, si, mid);  //Sort left part
        mergeSort(a, mid + 1, ei);  //Sort right part
        merge(a, si, mid, ei);    //Merge both parts
    }

    public static void main(String args[]){
        int a[] = {6, 3, 9, 5, 2, 8};
        mergeSort(a, 0, a.length - 1);
        printArr(a);
    }
}
