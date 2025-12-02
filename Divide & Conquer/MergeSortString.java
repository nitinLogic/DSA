//This code is application on Merge Sort on array of strings
import java.util.*;

public class MergeSortString {
    public static void printArr(String arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSortString(String a[], int si, int ei){
        //Base case
        if(si >= ei){
            return;
        }

        int mid = si + (ei - si)/2;
        mergeSortString(a, si, mid);    //Left part
        mergeSortString(a, mid + 1, ei);        //Right part
        merge(a, mid, si, ei);
        return;
    }

    public static void merge(String a[], int mid, int si, int ei){
        String temp[] = new String[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if(a[i].compareTo(a[j]) < 0){
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

        //Copy temp array to original arr
        for(k = 0, i = si; i < temp.length; i++, k++){
            a[i] = temp[k];
        }
        return;
    }

    public static void main(String args[]){
        String arr[] = {"sun", "earth", "mars", "mercury"};
        mergeSortString(arr, 0, arr.length - 1);
        printArr(arr);
    }
}