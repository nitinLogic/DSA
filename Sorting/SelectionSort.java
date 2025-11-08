//This code performs Selection sort of an integer array
import java.util.*;

public class SelectionSort{
    public static void selectionSort(int a[]){
        for(int i = 0; i < a.length; i++){
            int minPos = i;
            for(int j = i + 1; j < a.length; j++){
                if(a[minPos] > a[j])
                    minPos = j;
            }

            int temp = a[minPos];
            a[minPos] = a[i];
            a[i] = temp;
        }
    }

    public static void printArr(int a[]){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    
    public static void main(String args[]){
        int a[] = {5, 4, 1, 3, 2};
        selectionSort(a);
        printArr(a);
    }
}